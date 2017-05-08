package huimei.speedment.hmdata.hmdata.hmdata.cfdadrug.impl;

import com.speedment.Speedment;
import com.speedment.config.Column;
import com.speedment.config.Table;
import com.speedment.config.mapper.TypeMapper;
import com.speedment.exception.SpeedmentException;
import com.speedment.internal.core.config.mapper.identity.IntegerIdentityMapper;
import com.speedment.internal.core.config.mapper.identity.StringIdentityMapper;
import com.speedment.internal.core.manager.sql.AbstractSqlManager;
import huimei.speedment.hmdata.hmdata.hmdata.cfdadrug.Cfdadrug;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.annotation.Generated;

/**
 * A manager implementation representing an entity (for example, a row) in
 * the com.speedment.internal.ui.config.TableProperty@25da935b.
 * <p>
 * This Class or Interface has been automatically generated by Speedment. Any
 * changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public class CfdadrugManagerImpl extends AbstractSqlManager<Cfdadrug> {
    
    private final TypeMapper<Integer, Integer> idTypeMapper = new IntegerIdentityMapper();
    private final TypeMapper<Integer, Integer> cfdaIdTypeMapper = new IntegerIdentityMapper();
    private final TypeMapper<String, String> drugTypeTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> registerNoTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> originalRegisterNoTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> approvalNumberTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> cnCompanyNameTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> enCompanyNameTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> cnAddressTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> enAddressTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> cnCountriesRegionsTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> enCountriesRegionsTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> cnProductNameTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> enProductNameTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> cnTradeNameTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> enTradeNameTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> dosageFormTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> specificationTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> packingSpecificationTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> cnManufacturerTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> enManufacturerTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> cnManufacturerAddrTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> enManufacturerAddrTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> cnManufacturerRegionsTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> enManufacturerRegionsTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> dateIssueTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> validityDeadlinesTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> subPackCompanyNameTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> subPackCompanyAddrTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> subPackReferenceDateTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> subPackReferenceDeadlinesTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> productClassTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> standardCodeTypeMapper = new StringIdentityMapper();
    private final TypeMapper<String, String> standardCodeRemarkTypeMapper = new StringIdentityMapper();
    
    public CfdadrugManagerImpl(Speedment speedment) {
        super(speedment);
        setSqlEntityMapper(this::defaultReadEntity);
    }
    
    @Override
    public Class<Cfdadrug> getEntityClass() {
        return Cfdadrug.class;
    }
    
    @Override
    public Object get(Cfdadrug entity, Column column) {
        switch (column.getName()) {
            case "id" : return entity.getId();
            case "cfda_id" : return entity.getCfdaId();
            case "drug_type" : return entity.getDrugType();
            case "register_no" : return entity.getRegisterNo();
            case "original_register_no" : return entity.getOriginalRegisterNo();
            case "approval_number" : return entity.getApprovalNumber();
            case "cn_company_name" : return entity.getCnCompanyName();
            case "en_company_name" : return entity.getEnCompanyName();
            case "cn_address" : return entity.getCnAddress();
            case "en_address" : return entity.getEnAddress();
            case "cn_countries_regions" : return entity.getCnCountriesRegions();
            case "en_countries_regions" : return entity.getEnCountriesRegions();
            case "cn_product_name" : return entity.getCnProductName();
            case "en_product_name" : return entity.getEnProductName();
            case "cn_trade_name" : return entity.getCnTradeName();
            case "en_trade_name" : return entity.getEnTradeName();
            case "dosage_form" : return entity.getDosageForm();
            case "specification" : return entity.getSpecification();
            case "packing_specification" : return entity.getPackingSpecification();
            case "cn_manufacturer" : return entity.getCnManufacturer();
            case "en_manufacturer" : return entity.getEnManufacturer();
            case "cn_manufacturer_addr" : return entity.getCnManufacturerAddr();
            case "en_manufacturer_addr" : return entity.getEnManufacturerAddr();
            case "cn_manufacturer_regions" : return entity.getCnManufacturerRegions();
            case "en_manufacturer_regions" : return entity.getEnManufacturerRegions();
            case "date_issue" : return entity.getDateIssue();
            case "validity_deadlines" : return entity.getValidityDeadlines();
            case "sub_pack_company_name" : return entity.getSubPackCompanyName();
            case "sub_pack_company_addr" : return entity.getSubPackCompanyAddr();
            case "sub_pack_reference_date" : return entity.getSubPackReferenceDate();
            case "sub_pack_reference_deadlines" : return entity.getSubPackReferenceDeadlines();
            case "product_class" : return entity.getProductClass();
            case "standard_code" : return entity.getStandardCode();
            case "standard_code_remark" : return entity.getStandardCodeRemark();
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @Override
    public void set(Cfdadrug entity, Column column, Object value) {
        switch (column.getName()) {
            case "id" : entity.setId((Integer) value); break;
            case "cfda_id" : entity.setCfdaId((Integer) value); break;
            case "drug_type" : entity.setDrugType((String) value); break;
            case "register_no" : entity.setRegisterNo((String) value); break;
            case "original_register_no" : entity.setOriginalRegisterNo((String) value); break;
            case "approval_number" : entity.setApprovalNumber((String) value); break;
            case "cn_company_name" : entity.setCnCompanyName((String) value); break;
            case "en_company_name" : entity.setEnCompanyName((String) value); break;
            case "cn_address" : entity.setCnAddress((String) value); break;
            case "en_address" : entity.setEnAddress((String) value); break;
            case "cn_countries_regions" : entity.setCnCountriesRegions((String) value); break;
            case "en_countries_regions" : entity.setEnCountriesRegions((String) value); break;
            case "cn_product_name" : entity.setCnProductName((String) value); break;
            case "en_product_name" : entity.setEnProductName((String) value); break;
            case "cn_trade_name" : entity.setCnTradeName((String) value); break;
            case "en_trade_name" : entity.setEnTradeName((String) value); break;
            case "dosage_form" : entity.setDosageForm((String) value); break;
            case "specification" : entity.setSpecification((String) value); break;
            case "packing_specification" : entity.setPackingSpecification((String) value); break;
            case "cn_manufacturer" : entity.setCnManufacturer((String) value); break;
            case "en_manufacturer" : entity.setEnManufacturer((String) value); break;
            case "cn_manufacturer_addr" : entity.setCnManufacturerAddr((String) value); break;
            case "en_manufacturer_addr" : entity.setEnManufacturerAddr((String) value); break;
            case "cn_manufacturer_regions" : entity.setCnManufacturerRegions((String) value); break;
            case "en_manufacturer_regions" : entity.setEnManufacturerRegions((String) value); break;
            case "date_issue" : entity.setDateIssue((String) value); break;
            case "validity_deadlines" : entity.setValidityDeadlines((String) value); break;
            case "sub_pack_company_name" : entity.setSubPackCompanyName((String) value); break;
            case "sub_pack_company_addr" : entity.setSubPackCompanyAddr((String) value); break;
            case "sub_pack_reference_date" : entity.setSubPackReferenceDate((String) value); break;
            case "sub_pack_reference_deadlines" : entity.setSubPackReferenceDeadlines((String) value); break;
            case "product_class" : entity.setProductClass((String) value); break;
            case "standard_code" : entity.setStandardCode((String) value); break;
            case "standard_code_remark" : entity.setStandardCodeRemark((String) value); break;
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @Override
    public Table getTable() {
        return speedment.getProjectComponent().getProject().findTableByName("hmdata.hmdata.cfdadrug");
    }
    
    protected Cfdadrug defaultReadEntity(ResultSet resultSet) {
        final Cfdadrug entity = newInstance();
        try {
            entity.setId(idTypeMapper.toJavaType(resultSet.getInt(1)));
            entity.setCfdaId(cfdaIdTypeMapper.toJavaType(getInt(resultSet, 2)));
            entity.setDrugType(drugTypeTypeMapper.toJavaType(resultSet.getString(3)));
            entity.setRegisterNo(registerNoTypeMapper.toJavaType(resultSet.getString(4)));
            entity.setOriginalRegisterNo(originalRegisterNoTypeMapper.toJavaType(resultSet.getString(5)));
            entity.setApprovalNumber(approvalNumberTypeMapper.toJavaType(resultSet.getString(6)));
            entity.setCnCompanyName(cnCompanyNameTypeMapper.toJavaType(resultSet.getString(7)));
            entity.setEnCompanyName(enCompanyNameTypeMapper.toJavaType(resultSet.getString(8)));
            entity.setCnAddress(cnAddressTypeMapper.toJavaType(resultSet.getString(9)));
            entity.setEnAddress(enAddressTypeMapper.toJavaType(resultSet.getString(10)));
            entity.setCnCountriesRegions(cnCountriesRegionsTypeMapper.toJavaType(resultSet.getString(11)));
            entity.setEnCountriesRegions(enCountriesRegionsTypeMapper.toJavaType(resultSet.getString(12)));
            entity.setCnProductName(cnProductNameTypeMapper.toJavaType(resultSet.getString(13)));
            entity.setEnProductName(enProductNameTypeMapper.toJavaType(resultSet.getString(14)));
            entity.setCnTradeName(cnTradeNameTypeMapper.toJavaType(resultSet.getString(15)));
            entity.setEnTradeName(enTradeNameTypeMapper.toJavaType(resultSet.getString(16)));
            entity.setDosageForm(dosageFormTypeMapper.toJavaType(resultSet.getString(17)));
            entity.setSpecification(specificationTypeMapper.toJavaType(resultSet.getString(18)));
            entity.setPackingSpecification(packingSpecificationTypeMapper.toJavaType(resultSet.getString(19)));
            entity.setCnManufacturer(cnManufacturerTypeMapper.toJavaType(resultSet.getString(20)));
            entity.setEnManufacturer(enManufacturerTypeMapper.toJavaType(resultSet.getString(21)));
            entity.setCnManufacturerAddr(cnManufacturerAddrTypeMapper.toJavaType(resultSet.getString(22)));
            entity.setEnManufacturerAddr(enManufacturerAddrTypeMapper.toJavaType(resultSet.getString(23)));
            entity.setCnManufacturerRegions(cnManufacturerRegionsTypeMapper.toJavaType(resultSet.getString(24)));
            entity.setEnManufacturerRegions(enManufacturerRegionsTypeMapper.toJavaType(resultSet.getString(25)));
            entity.setDateIssue(dateIssueTypeMapper.toJavaType(resultSet.getString(26)));
            entity.setValidityDeadlines(validityDeadlinesTypeMapper.toJavaType(resultSet.getString(27)));
            entity.setSubPackCompanyName(subPackCompanyNameTypeMapper.toJavaType(resultSet.getString(28)));
            entity.setSubPackCompanyAddr(subPackCompanyAddrTypeMapper.toJavaType(resultSet.getString(29)));
            entity.setSubPackReferenceDate(subPackReferenceDateTypeMapper.toJavaType(resultSet.getString(30)));
            entity.setSubPackReferenceDeadlines(subPackReferenceDeadlinesTypeMapper.toJavaType(resultSet.getString(31)));
            entity.setProductClass(productClassTypeMapper.toJavaType(resultSet.getString(32)));
            entity.setStandardCode(standardCodeTypeMapper.toJavaType(resultSet.getString(33)));
            entity.setStandardCodeRemark(standardCodeRemarkTypeMapper.toJavaType(resultSet.getString(34)));
        }
        catch (SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    @Override
    public Cfdadrug newInstance() {
        return new CfdadrugImpl(speedment);
    }
    
    @Override
    public Integer primaryKeyFor(Cfdadrug entity) {
        return entity.getId();
    }
}