package speedment;

import com.speedment.Manager;
import com.speedment.Speedment;
import huimei.speedment.hmdata.HmdataApplication;
import huimei.speedment.hmdata.hmdata.hmdata.drugcommon.Drugcommon;
import huimei.speedment.hmdata.hmdata.hmdata.drugcommon.impl.DrugcommonManagerImpl;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * User: TangWenWu
 * Date: 2016/1/13
 * Time: 23:11
 * CopyRight:HuiMei Engine
 */
public class DrugCommonTest {
    public static void main(String... args) {
        Speedment speedment = new HmdataApplication().withPassword("dataisbest").build();
        DrugcommonManagerImpl drugcommonManager = new DrugcommonManagerImpl(speedment);
        Optional<Drugcommon> drugcommonOptional = drugcommonManager.stream()
                .filter(drugcommon -> drugcommon.getCateId().equals("22"))
                .filter(drugcommon1 -> drugcommon1.getOtc().equals(1)).findAny();
        System.out.println(drugcommonOptional.get());
    }
}
