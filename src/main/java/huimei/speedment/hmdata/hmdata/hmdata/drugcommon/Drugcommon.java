package huimei.speedment.hmdata.hmdata.hmdata.drugcommon;

import com.speedment.Entity;
import com.speedment.field.ComparableField;
import com.speedment.field.StringField;
import com.speedment.internal.core.field.ComparableFieldImpl;
import com.speedment.internal.core.field.StringFieldImpl;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * An interface representing an entity (for example, a row) in the
 * com.speedment.internal.ui.config.TableProperty@32e54412.
 * <p>
 * This Class or Interface has been automatically generated by Speedment. Any
 * changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface Drugcommon extends Entity<Drugcommon> {
    
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getId()} method.
     */
    public final static ComparableField<Drugcommon, Integer> ID = new ComparableFieldImpl<>("id", Drugcommon::getId, Drugcommon::setId);
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getCommonName()} method.
     */
    public final static StringField<Drugcommon> COMMONNAME = new StringFieldImpl<>("common_name", o -> o.getCommonName().orElse(null), Drugcommon::setCommonName);
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getEngName()} method.
     */
    public final static StringField<Drugcommon> ENGNAME = new StringFieldImpl<>("eng_name", o -> o.getEngName().orElse(null), Drugcommon::setEngName);
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getVsName()} method.
     */
    public final static StringField<Drugcommon> VSNAME = new StringFieldImpl<>("vs_name", o -> o.getVsName().orElse(null), Drugcommon::setVsName);
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getFda()} method.
     */
    public final static StringField<Drugcommon> FDA = new StringFieldImpl<>("fda", o -> o.getFda().orElse(null), Drugcommon::setFda);
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getType()} method.
     */
    public final static StringField<Drugcommon> TYPE = new StringFieldImpl<>("type", o -> o.getType().orElse(null), Drugcommon::setType);
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getOtc()} method.
     */
    public final static ComparableField<Drugcommon, Integer> OTC = new ComparableFieldImpl<>("otc", Drugcommon::getOtc, Drugcommon::setOtc);
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getInnComponentName()} method.
     */
    public final static StringField<Drugcommon> INNCOMPONENTNAME = new StringFieldImpl<>("inn_component_name", o -> o.getInnComponentName().orElse(null), Drugcommon::setInnComponentName);
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getAtcCode()} method.
     */
    public final static StringField<Drugcommon> ATCCODE = new StringFieldImpl<>("atc_code", o -> o.getAtcCode().orElse(null), Drugcommon::setAtcCode);
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getCateId()} method.
     */
    public final static StringField<Drugcommon> CATEID = new StringFieldImpl<>("cate_id", o -> o.getCateId().orElse(null), Drugcommon::setCateId);
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getClassId()} method.
     */
    public final static ComparableField<Drugcommon, Integer> CLASSID = new ComparableFieldImpl<>("class_id", o -> o.getClassId().orElse(null), Drugcommon::setClassId);
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getClassName()} method.
     */
    public final static StringField<Drugcommon> CLASSNAME = new StringFieldImpl<>("class_name", o -> o.getClassName().orElse(null), Drugcommon::setClassName);
    /**
     * This Field corresponds to the {@link Drugcommon} field that can be
     * obtained using the {@link Drugcommon#getProductClass()} method.
     */
    public final static StringField<Drugcommon> PRODUCTCLASS = new StringFieldImpl<>("product_class", o -> o.getProductClass().orElse(null), Drugcommon::setProductClass);
    
    /**
     * Returns the id of this Drugcommon. The id field corresponds to the
     * database column hmdata.hmdata.drugcommon.id.
     * 
     * @return the id of this Drugcommon
     */
    Integer getId();
    
    /**
     * Returns the commonName of this Drugcommon. The commonName field
     * corresponds to the database column hmdata.hmdata.drugcommon.common_name.
     * 
     * @return the commonName of this Drugcommon
     */
    Optional<String> getCommonName();
    
    /**
     * Returns the engName of this Drugcommon. The engName field corresponds to
     * the database column hmdata.hmdata.drugcommon.eng_name.
     * 
     * @return the engName of this Drugcommon
     */
    Optional<String> getEngName();
    
    /**
     * Returns the vsName of this Drugcommon. The vsName field corresponds to the
     * database column hmdata.hmdata.drugcommon.vs_name.
     * 
     * @return the vsName of this Drugcommon
     */
    Optional<String> getVsName();
    
    /**
     * Returns the fda of this Drugcommon. The fda field corresponds to the
     * database column hmdata.hmdata.drugcommon.fda.
     * 
     * @return the fda of this Drugcommon
     */
    Optional<String> getFda();
    
    /**
     * Returns the type of this Drugcommon. The type field corresponds to the
     * database column hmdata.hmdata.drugcommon.type.
     * 
     * @return the type of this Drugcommon
     */
    Optional<String> getType();
    
    /**
     * Returns the otc of this Drugcommon. The otc field corresponds to the
     * database column hmdata.hmdata.drugcommon.otc.
     * 
     * @return the otc of this Drugcommon
     */
    Integer getOtc();
    
    /**
     * Returns the innComponentName of this Drugcommon. The innComponentName
     * field corresponds to the database column
     * hmdata.hmdata.drugcommon.inn_component_name.
     * 
     * @return the innComponentName of this Drugcommon
     */
    Optional<String> getInnComponentName();
    
    /**
     * Returns the atcCode of this Drugcommon. The atcCode field corresponds to
     * the database column hmdata.hmdata.drugcommon.atc_code.
     * 
     * @return the atcCode of this Drugcommon
     */
    Optional<String> getAtcCode();
    
    /**
     * Returns the cateId of this Drugcommon. The cateId field corresponds to the
     * database column hmdata.hmdata.drugcommon.cate_id.
     * 
     * @return the cateId of this Drugcommon
     */
    Optional<String> getCateId();
    
    /**
     * Returns the classId of this Drugcommon. The classId field corresponds to
     * the database column hmdata.hmdata.drugcommon.class_id.
     * 
     * @return the classId of this Drugcommon
     */
    Optional<Integer> getClassId();
    
    /**
     * Returns the className of this Drugcommon. The className field corresponds
     * to the database column hmdata.hmdata.drugcommon.class_name.
     * 
     * @return the className of this Drugcommon
     */
    Optional<String> getClassName();
    
    /**
     * Returns the productClass of this Drugcommon. The productClass field
     * corresponds to the database column hmdata.hmdata.drugcommon.product_class.
     * 
     * @return the productClass of this Drugcommon
     */
    Optional<String> getProductClass();
    
    /**
     * Sets the id of this Drugcommon. The id field corresponds to the database
     * column hmdata.hmdata.drugcommon.id.
     * 
     * @param id to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setId(Integer id);
    
    /**
     * Sets the commonName of this Drugcommon. The commonName field corresponds
     * to the database column hmdata.hmdata.drugcommon.common_name.
     * 
     * @param commonName to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setCommonName(String commonName);
    
    /**
     * Sets the engName of this Drugcommon. The engName field corresponds to the
     * database column hmdata.hmdata.drugcommon.eng_name.
     * 
     * @param engName to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setEngName(String engName);
    
    /**
     * Sets the vsName of this Drugcommon. The vsName field corresponds to the
     * database column hmdata.hmdata.drugcommon.vs_name.
     * 
     * @param vsName to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setVsName(String vsName);
    
    /**
     * Sets the fda of this Drugcommon. The fda field corresponds to the database
     * column hmdata.hmdata.drugcommon.fda.
     * 
     * @param fda to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setFda(String fda);
    
    /**
     * Sets the type of this Drugcommon. The type field corresponds to the
     * database column hmdata.hmdata.drugcommon.type.
     * 
     * @param type to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setType(String type);
    
    /**
     * Sets the otc of this Drugcommon. The otc field corresponds to the database
     * column hmdata.hmdata.drugcommon.otc.
     * 
     * @param otc to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setOtc(Integer otc);
    
    /**
     * Sets the innComponentName of this Drugcommon. The innComponentName field
     * corresponds to the database column
     * hmdata.hmdata.drugcommon.inn_component_name.
     * 
     * @param innComponentName to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setInnComponentName(String innComponentName);
    
    /**
     * Sets the atcCode of this Drugcommon. The atcCode field corresponds to the
     * database column hmdata.hmdata.drugcommon.atc_code.
     * 
     * @param atcCode to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setAtcCode(String atcCode);
    
    /**
     * Sets the cateId of this Drugcommon. The cateId field corresponds to the
     * database column hmdata.hmdata.drugcommon.cate_id.
     * 
     * @param cateId to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setCateId(String cateId);
    
    /**
     * Sets the classId of this Drugcommon. The classId field corresponds to the
     * database column hmdata.hmdata.drugcommon.class_id.
     * 
     * @param classId to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setClassId(Integer classId);
    
    /**
     * Sets the className of this Drugcommon. The className field corresponds to
     * the database column hmdata.hmdata.drugcommon.class_name.
     * 
     * @param className to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setClassName(String className);
    
    /**
     * Sets the productClass of this Drugcommon. The productClass field
     * corresponds to the database column hmdata.hmdata.drugcommon.product_class.
     * 
     * @param productClass to set of this Drugcommon
     * @return this Drugcommon instance
     */
    Drugcommon setProductClass(String productClass);
}