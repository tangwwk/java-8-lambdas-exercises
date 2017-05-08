
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: TangWenWu
 * Date: 2017-03-26
 * Time: 15:11
 * CopyRight:HuiMei Engine
 */
public class MessageFormatUtils {

    private static final String TEMPLATE = "{0}：操作人：{1}，所属医院：{2}，操作对象ID：{3}，操作对象名：{4}";

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MessageFormatUtils.class);

    public static void main(String[] args) {
        Object[] o = {"增加帐号", "tangwenwu","IBM", 12, "oracel"};
        System.out.println(MessageFormatUtils.byMessageFormat(TEMPLATE,o));

        String str="我是{0},我来自{1},今年{2}岁";
        String[] arr={"中国人","长沙","22"};
        System.out.println(fillStringByArgs(str, arr));


        String aa= "我们都是好孩子,${num}说是嘛？ 我觉得${people}是傻蛋!";
        Map<String, String> map = new HashMap<String, String>();
        map.put("num","张三");
        map.put("people","小明");
        System.out.println(MessageFormatUtils.resolvePlaceholders(aa, map));

        String ruds ="{1}为通过肾消除的药物，{0}与{1}也存在药物相互作用的风险，但0实际上完全与血浆蛋白结合，随之会与其他高蛋白结合药物发生置换作用，必须注意";
        Object[] drugs = {"醋氯芬酸", "锂盐"};
        System.out.println(MessageFormatUtils.byMessageFormat(ruds,drugs));
    }

    /**
     * Prefix for system property placeholders: "${"
     */
    public static final String PLACEHOLDER_PREFIX = "${";
    /**
     * Suffix for system property placeholders: "}"
     */
    public static final String PLACEHOLDER_SUFFIX = "}";

    public static String resolvePlaceholders(String text, Map<String, String> parameter) {
        if (parameter == null || parameter.isEmpty()) {
            return text;
        }
        StringBuilder buf = new StringBuilder(text);
        int startIndex = buf.indexOf(PLACEHOLDER_PREFIX);
        while (startIndex != -1) {
            int endIndex = buf.indexOf(PLACEHOLDER_SUFFIX, startIndex + PLACEHOLDER_PREFIX.length());
            if (endIndex != -1) {
                String placeholder = buf.substring(startIndex + PLACEHOLDER_PREFIX.length(), endIndex);
                int nextIndex = endIndex + PLACEHOLDER_SUFFIX.length();
                try {
                    String propVal = parameter.get(placeholder);
                    if (propVal != null) {
                        buf.replace(startIndex, endIndex + PLACEHOLDER_SUFFIX.length(), propVal);
                        nextIndex = startIndex + propVal.length();
                    } else {
                        logger.warn("Could not resolve placeholder '" + placeholder + "' in [" + text + "] ");
                    }
                } catch (Exception ex) {
                    logger.warn("Could not resolve placeholder '" + placeholder + "' in [" + text + "]: " + ex);
                }
                startIndex = buf.indexOf(PLACEHOLDER_PREFIX, nextIndex);
            } else {
                startIndex = -1;
            }
        }
        return buf.toString();
    }

    public static final String byMessageFormat(String template, Object[] o){

        MessageFormat mf = new MessageFormat(template);

        return mf.format(o);

    }

    private static String fillStringByArgs(String str,String[] arr){
        Matcher m= Pattern.compile("\\{(\\d)\\}").matcher(str);
        while(m.find()){
            str=str.replace(m.group(),arr[Integer.parseInt(m.group(1))]);
        }
        return str;
    }


}