package huimei.speedment.hmdata.hmdata.hmdata.drugcommon.impl;

import com.speedment.Speedment;
import com.speedment.internal.core.code.AbstractBaseEntity;
import huimei.speedment.hmdata.hmdata.hmdata.drugcommon.Drugcommon;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * An implementation representing an entity (for example, a row) in the
 * com.speedment.internal.ui.config.TableProperty@32e54412.
 * <p>
 * This Class or Interface has been automatically generated by Speedment. Any
 * changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public final class DrugcommonImpl extends AbstractBaseEntity<Drugcommon> implements Drugcommon {
    
    private Integer id;
    private String commonName;
    private String engName;
    private String vsName;
    private String fda;
    private String type;
    private Integer otc;
    private String innComponentName;
    private String atcCode;
    private String cateId;
    private Integer classId;
    private String className;
    private String productClass;
    
    DrugcommonImpl(Speedment speedment) {
        super(speedment);
    }
    
    public DrugcommonImpl(Speedment speedment, final Drugcommon drugcommon) {
        super(speedment);
        setId(drugcommon.getId());
        drugcommon.getCommonName().ifPresent(this::setCommonName);
        drugcommon.getEngName().ifPresent(this::setEngName);
        drugcommon.getVsName().ifPresent(this::setVsName);
        drugcommon.getFda().ifPresent(this::setFda);
        drugcommon.getType().ifPresent(this::setType);
        setOtc(drugcommon.getOtc());
        drugcommon.getInnComponentName().ifPresent(this::setInnComponentName);
        drugcommon.getAtcCode().ifPresent(this::setAtcCode);
        drugcommon.getCateId().ifPresent(this::setCateId);
        drugcommon.getClassId().ifPresent(this::setClassId);
        drugcommon.getClassName().ifPresent(this::setClassName);
        drugcommon.getProductClass().ifPresent(this::setProductClass);
    }
    
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public Optional<String> getCommonName() {
        return Optional.ofNullable(commonName);
    }
    
    @Override
    public Optional<String> getEngName() {
        return Optional.ofNullable(engName);
    }
    
    @Override
    public Optional<String> getVsName() {
        return Optional.ofNullable(vsName);
    }
    
    @Override
    public Optional<String> getFda() {
        return Optional.ofNullable(fda);
    }
    
    @Override
    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }
    
    @Override
    public Integer getOtc() {
        return otc;
    }
    
    @Override
    public Optional<String> getInnComponentName() {
        return Optional.ofNullable(innComponentName);
    }
    
    @Override
    public Optional<String> getAtcCode() {
        return Optional.ofNullable(atcCode);
    }
    
    @Override
    public Optional<String> getCateId() {
        return Optional.ofNullable(cateId);
    }
    
    @Override
    public Optional<Integer> getClassId() {
        return Optional.ofNullable(classId);
    }
    
    @Override
    public Optional<String> getClassName() {
        return Optional.ofNullable(className);
    }
    
    @Override
    public Optional<String> getProductClass() {
        return Optional.ofNullable(productClass);
    }
    
    @Override
    public final DrugcommonImpl setId(Integer id) {
        this.id = id;
        return this;
    }
    
    @Override
    public final DrugcommonImpl setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    
    @Override
    public final DrugcommonImpl setEngName(String engName) {
        this.engName = engName;
        return this;
    }
    
    @Override
    public final DrugcommonImpl setVsName(String vsName) {
        this.vsName = vsName;
        return this;
    }
    
    @Override
    public final DrugcommonImpl setFda(String fda) {
        this.fda = fda;
        return this;
    }
    
    @Override
    public final DrugcommonImpl setType(String type) {
        this.type = type;
        return this;
    }
    
    @Override
    public final DrugcommonImpl setOtc(Integer otc) {
        this.otc = otc;
        return this;
    }
    
    @Override
    public final DrugcommonImpl setInnComponentName(String innComponentName) {
        this.innComponentName = innComponentName;
        return this;
    }
    
    @Override
    public final DrugcommonImpl setAtcCode(String atcCode) {
        this.atcCode = atcCode;
        return this;
    }
    
    @Override
    public final DrugcommonImpl setCateId(String cateId) {
        this.cateId = cateId;
        return this;
    }
    
    @Override
    public final DrugcommonImpl setClassId(Integer classId) {
        this.classId = classId;
        return this;
    }
    
    @Override
    public final DrugcommonImpl setClassName(String className) {
        this.className = className;
        return this;
    }
    
    @Override
    public final DrugcommonImpl setProductClass(String productClass) {
        this.productClass = productClass;
        return this;
    }
    
    @Override
    public Drugcommon copy() {
        return new DrugcommonImpl(getSpeedment_(), this);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "+Objects.toString(getId()));
        sj.add("commonName = "+Objects.toString(getCommonName().orElse(null)));
        sj.add("engName = "+Objects.toString(getEngName().orElse(null)));
        sj.add("vsName = "+Objects.toString(getVsName().orElse(null)));
        sj.add("fda = "+Objects.toString(getFda().orElse(null)));
        sj.add("type = "+Objects.toString(getType().orElse(null)));
        sj.add("otc = "+Objects.toString(getOtc()));
        sj.add("innComponentName = "+Objects.toString(getInnComponentName().orElse(null)));
        sj.add("atcCode = "+Objects.toString(getAtcCode().orElse(null)));
        sj.add("cateId = "+Objects.toString(getCateId().orElse(null)));
        sj.add("classId = "+Objects.toString(getClassId().orElse(null)));
        sj.add("className = "+Objects.toString(getClassName().orElse(null)));
        sj.add("productClass = "+Objects.toString(getProductClass().orElse(null)));
        return "DrugcommonImpl "+sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Drugcommon)) { return false; }
        @SuppressWarnings("unchecked")
        final Drugcommon thatDrugcommon = (Drugcommon)that;
        if (!Objects.equals(this.getId(), thatDrugcommon.getId())) {return false; }
        if (!Objects.equals(this.getCommonName(), thatDrugcommon.getCommonName())) {return false; }
        if (!Objects.equals(this.getEngName(), thatDrugcommon.getEngName())) {return false; }
        if (!Objects.equals(this.getVsName(), thatDrugcommon.getVsName())) {return false; }
        if (!Objects.equals(this.getFda(), thatDrugcommon.getFda())) {return false; }
        if (!Objects.equals(this.getType(), thatDrugcommon.getType())) {return false; }
        if (!Objects.equals(this.getOtc(), thatDrugcommon.getOtc())) {return false; }
        if (!Objects.equals(this.getInnComponentName(), thatDrugcommon.getInnComponentName())) {return false; }
        if (!Objects.equals(this.getAtcCode(), thatDrugcommon.getAtcCode())) {return false; }
        if (!Objects.equals(this.getCateId(), thatDrugcommon.getCateId())) {return false; }
        if (!Objects.equals(this.getClassId(), thatDrugcommon.getClassId())) {return false; }
        if (!Objects.equals(this.getClassName(), thatDrugcommon.getClassName())) {return false; }
        if (!Objects.equals(this.getProductClass(), thatDrugcommon.getProductClass())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getCommonName());
        hash = 31 * hash + Objects.hashCode(getEngName());
        hash = 31 * hash + Objects.hashCode(getVsName());
        hash = 31 * hash + Objects.hashCode(getFda());
        hash = 31 * hash + Objects.hashCode(getType());
        hash = 31 * hash + Objects.hashCode(getOtc());
        hash = 31 * hash + Objects.hashCode(getInnComponentName());
        hash = 31 * hash + Objects.hashCode(getAtcCode());
        hash = 31 * hash + Objects.hashCode(getCateId());
        hash = 31 * hash + Objects.hashCode(getClassId());
        hash = 31 * hash + Objects.hashCode(getClassName());
        hash = 31 * hash + Objects.hashCode(getProductClass());
        return hash;
    }
    
    @Override
    public Class<Drugcommon> getEntityClass_() {
        return Drugcommon.class;
    }
}