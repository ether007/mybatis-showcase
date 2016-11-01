package com.jiuxing.drm.model;

import java.io.Serializable;
import java.util.Date;

public class VehicleOrderAdTmp implements Serializable {
    private Integer id;

    private Integer adId;

    private String orderId;

    private Byte adType;

    private Integer userId;

    private String adminId;

    private Date scheduleStartDate;

    private Date scheduleEndDate;

    private Date realStartTime;

    private Date realEndTime;

    private Byte status;

    private String smallpicUrl;

    private Short brandId;

    private Short modelId;

    private Short modelchildId;

    private Byte nation;

    private Byte type;

    private Byte typeExt;

    private String otherBrandName;

    private String otherModelName;

    private String provinceId;

    private Short zoneId;

    private String markprovinceId;

    private Short markzoneId;

    private Short buyYear;

    private Byte buyMonth;

    private Byte buyDay;

    private Short regYear;

    private Byte regMonth;

    private Byte regDay;

    private Short dealzoneId;

    private Integer validdays;

    private Byte gearbox;

    private Byte air;

    private Byte cylinder;

    private Short seating;

    private String loads;

    private String airdisplacement;

    private Byte qhcp;

    private Byte drivingLicense;

    private Byte invoice;

    private Byte surtax;

    private Short roadtollYear;

    private Byte roadtollMonth;

    private Short usetaxYear;

    private Byte usetaxMonth;

    private Short insuranceYear;

    private Byte insuranceMonth;

    private Short motYear;

    private Byte motMonth;

    private Byte instalment;

    private String config;

    private Byte color;

    private String colour;

    private Integer distance;

    private Byte registrationMark;

    private Integer price;

    private String contactman;

    private String telephone;

    private String collectorAdminId;

    private Date recordTime;

    private String statusAdminId;

    private Date statusTime;

    private Byte companyBranchId;

    private String collectionId;

    private String licenseNumber;

    private Byte combo;

    private Byte level;

    private Byte priority;

    private String vin;

    private Integer rank;

    private Integer vehicleCondition;

    private Integer vctypebelong;

    private String rbMakecode;

    private String rbFamily;

    private String rbYear;

    private String rbVehiclekey;

    private String qa;

    private String authcode;

    private Integer isqa;

    private String qasn;

    private Byte payWay;

    private Byte priceType;

    private Byte isCrest;

    private Date crestCreateTime;

    private Date crestStartTime;

    private Date crestEndTime;

    private Byte crestStatus;

    private Byte hasBackground;

    private Date backgroundCreateTime;

    private Date backgroundStartTime;

    private Date backgroundEndTime;

    private Byte backgroundStatus;

    private Integer promotionState;

    private Byte consumeStatus;

    private String category;

    private Integer fuelType;

    private Integer innerColor;

    private Integer engineSize;

    private String md5code;

    private String brand;

    private Short countyId;

    private Short markcountyId;

    private Integer sex;

    private String email;

    private Integer usages;

    private Byte repairRecorder;

    private Boolean credit;

    private Short score;

    private Integer iscore;

    private Byte transfer;

    private String service;

    private Byte substatus;

    private Byte bargainsStatus;

    private Byte bodyStyle;

    private Byte driveType;

    private String badge;

    private Short makeYear;

    private Byte serviceCount;

    private String sellingPoint;

    private Byte emissionStandardId;

    private Integer servicebit;

    private Integer salesId;

    private String customCode;

    private String pictureUrls;

    private String description;

    private String invoiceNumber;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Byte getAdType() {
        return adType;
    }

    public void setAdType(Byte adType) {
        this.adType = adType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public Date getScheduleStartDate() {
        return scheduleStartDate;
    }

    public void setScheduleStartDate(Date scheduleStartDate) {
        this.scheduleStartDate = scheduleStartDate;
    }

    public Date getScheduleEndDate() {
        return scheduleEndDate;
    }

    public void setScheduleEndDate(Date scheduleEndDate) {
        this.scheduleEndDate = scheduleEndDate;
    }

    public Date getRealStartTime() {
        return realStartTime;
    }

    public void setRealStartTime(Date realStartTime) {
        this.realStartTime = realStartTime;
    }

    public Date getRealEndTime() {
        return realEndTime;
    }

    public void setRealEndTime(Date realEndTime) {
        this.realEndTime = realEndTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getSmallpicUrl() {
        return smallpicUrl;
    }

    public void setSmallpicUrl(String smallpicUrl) {
        this.smallpicUrl = smallpicUrl == null ? null : smallpicUrl.trim();
    }

    public Short getBrandId() {
        return brandId;
    }

    public void setBrandId(Short brandId) {
        this.brandId = brandId;
    }

    public Short getModelId() {
        return modelId;
    }

    public void setModelId(Short modelId) {
        this.modelId = modelId;
    }

    public Short getModelchildId() {
        return modelchildId;
    }

    public void setModelchildId(Short modelchildId) {
        this.modelchildId = modelchildId;
    }

    public Byte getNation() {
        return nation;
    }

    public void setNation(Byte nation) {
        this.nation = nation;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getTypeExt() {
        return typeExt;
    }

    public void setTypeExt(Byte typeExt) {
        this.typeExt = typeExt;
    }

    public String getOtherBrandName() {
        return otherBrandName;
    }

    public void setOtherBrandName(String otherBrandName) {
        this.otherBrandName = otherBrandName == null ? null : otherBrandName.trim();
    }

    public String getOtherModelName() {
        return otherModelName;
    }

    public void setOtherModelName(String otherModelName) {
        this.otherModelName = otherModelName == null ? null : otherModelName.trim();
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public Short getZoneId() {
        return zoneId;
    }

    public void setZoneId(Short zoneId) {
        this.zoneId = zoneId;
    }

    public String getMarkprovinceId() {
        return markprovinceId;
    }

    public void setMarkprovinceId(String markprovinceId) {
        this.markprovinceId = markprovinceId == null ? null : markprovinceId.trim();
    }

    public Short getMarkzoneId() {
        return markzoneId;
    }

    public void setMarkzoneId(Short markzoneId) {
        this.markzoneId = markzoneId;
    }

    public Short getBuyYear() {
        return buyYear;
    }

    public void setBuyYear(Short buyYear) {
        this.buyYear = buyYear;
    }

    public Byte getBuyMonth() {
        return buyMonth;
    }

    public void setBuyMonth(Byte buyMonth) {
        this.buyMonth = buyMonth;
    }

    public Byte getBuyDay() {
        return buyDay;
    }

    public void setBuyDay(Byte buyDay) {
        this.buyDay = buyDay;
    }

    public Short getRegYear() {
        return regYear;
    }

    public void setRegYear(Short regYear) {
        this.regYear = regYear;
    }

    public Byte getRegMonth() {
        return regMonth;
    }

    public void setRegMonth(Byte regMonth) {
        this.regMonth = regMonth;
    }

    public Byte getRegDay() {
        return regDay;
    }

    public void setRegDay(Byte regDay) {
        this.regDay = regDay;
    }

    public Short getDealzoneId() {
        return dealzoneId;
    }

    public void setDealzoneId(Short dealzoneId) {
        this.dealzoneId = dealzoneId;
    }

    public Integer getValiddays() {
        return validdays;
    }

    public void setValiddays(Integer validdays) {
        this.validdays = validdays;
    }

    public Byte getGearbox() {
        return gearbox;
    }

    public void setGearbox(Byte gearbox) {
        this.gearbox = gearbox;
    }

    public Byte getAir() {
        return air;
    }

    public void setAir(Byte air) {
        this.air = air;
    }

    public Byte getCylinder() {
        return cylinder;
    }

    public void setCylinder(Byte cylinder) {
        this.cylinder = cylinder;
    }

    public Short getSeating() {
        return seating;
    }

    public void setSeating(Short seating) {
        this.seating = seating;
    }

    public String getLoads() {
        return loads;
    }

    public void setLoads(String loads) {
        this.loads = loads == null ? null : loads.trim();
    }

    public String getAirdisplacement() {
        return airdisplacement;
    }

    public void setAirdisplacement(String airdisplacement) {
        this.airdisplacement = airdisplacement == null ? null : airdisplacement.trim();
    }

    public Byte getQhcp() {
        return qhcp;
    }

    public void setQhcp(Byte qhcp) {
        this.qhcp = qhcp;
    }

    public Byte getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(Byte drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public Byte getInvoice() {
        return invoice;
    }

    public void setInvoice(Byte invoice) {
        this.invoice = invoice;
    }

    public Byte getSurtax() {
        return surtax;
    }

    public void setSurtax(Byte surtax) {
        this.surtax = surtax;
    }

    public Short getRoadtollYear() {
        return roadtollYear;
    }

    public void setRoadtollYear(Short roadtollYear) {
        this.roadtollYear = roadtollYear;
    }

    public Byte getRoadtollMonth() {
        return roadtollMonth;
    }

    public void setRoadtollMonth(Byte roadtollMonth) {
        this.roadtollMonth = roadtollMonth;
    }

    public Short getUsetaxYear() {
        return usetaxYear;
    }

    public void setUsetaxYear(Short usetaxYear) {
        this.usetaxYear = usetaxYear;
    }

    public Byte getUsetaxMonth() {
        return usetaxMonth;
    }

    public void setUsetaxMonth(Byte usetaxMonth) {
        this.usetaxMonth = usetaxMonth;
    }

    public Short getInsuranceYear() {
        return insuranceYear;
    }

    public void setInsuranceYear(Short insuranceYear) {
        this.insuranceYear = insuranceYear;
    }

    public Byte getInsuranceMonth() {
        return insuranceMonth;
    }

    public void setInsuranceMonth(Byte insuranceMonth) {
        this.insuranceMonth = insuranceMonth;
    }

    public Short getMotYear() {
        return motYear;
    }

    public void setMotYear(Short motYear) {
        this.motYear = motYear;
    }

    public Byte getMotMonth() {
        return motMonth;
    }

    public void setMotMonth(Byte motMonth) {
        this.motMonth = motMonth;
    }

    public Byte getInstalment() {
        return instalment;
    }

    public void setInstalment(Byte instalment) {
        this.instalment = instalment;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }

    public Byte getColor() {
        return color;
    }

    public void setColor(Byte color) {
        this.color = color;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour == null ? null : colour.trim();
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Byte getRegistrationMark() {
        return registrationMark;
    }

    public void setRegistrationMark(Byte registrationMark) {
        this.registrationMark = registrationMark;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getContactman() {
        return contactman;
    }

    public void setContactman(String contactman) {
        this.contactman = contactman == null ? null : contactman.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getCollectorAdminId() {
        return collectorAdminId;
    }

    public void setCollectorAdminId(String collectorAdminId) {
        this.collectorAdminId = collectorAdminId == null ? null : collectorAdminId.trim();
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getStatusAdminId() {
        return statusAdminId;
    }

    public void setStatusAdminId(String statusAdminId) {
        this.statusAdminId = statusAdminId == null ? null : statusAdminId.trim();
    }

    public Date getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(Date statusTime) {
        this.statusTime = statusTime;
    }

    public Byte getCompanyBranchId() {
        return companyBranchId;
    }

    public void setCompanyBranchId(Byte companyBranchId) {
        this.companyBranchId = companyBranchId;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId == null ? null : collectionId.trim();
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber == null ? null : licenseNumber.trim();
    }

    public Byte getCombo() {
        return combo;
    }

    public void setCombo(Byte combo) {
        this.combo = combo;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(Integer vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    public Integer getVctypebelong() {
        return vctypebelong;
    }

    public void setVctypebelong(Integer vctypebelong) {
        this.vctypebelong = vctypebelong;
    }

    public String getRbMakecode() {
        return rbMakecode;
    }

    public void setRbMakecode(String rbMakecode) {
        this.rbMakecode = rbMakecode == null ? null : rbMakecode.trim();
    }

    public String getRbFamily() {
        return rbFamily;
    }

    public void setRbFamily(String rbFamily) {
        this.rbFamily = rbFamily == null ? null : rbFamily.trim();
    }

    public String getRbYear() {
        return rbYear;
    }

    public void setRbYear(String rbYear) {
        this.rbYear = rbYear == null ? null : rbYear.trim();
    }

    public String getRbVehiclekey() {
        return rbVehiclekey;
    }

    public void setRbVehiclekey(String rbVehiclekey) {
        this.rbVehiclekey = rbVehiclekey == null ? null : rbVehiclekey.trim();
    }

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa == null ? null : qa.trim();
    }

    public String getAuthcode() {
        return authcode;
    }

    public void setAuthcode(String authcode) {
        this.authcode = authcode == null ? null : authcode.trim();
    }

    public Integer getIsqa() {
        return isqa;
    }

    public void setIsqa(Integer isqa) {
        this.isqa = isqa;
    }

    public String getQasn() {
        return qasn;
    }

    public void setQasn(String qasn) {
        this.qasn = qasn == null ? null : qasn.trim();
    }

    public Byte getPayWay() {
        return payWay;
    }

    public void setPayWay(Byte payWay) {
        this.payWay = payWay;
    }

    public Byte getPriceType() {
        return priceType;
    }

    public void setPriceType(Byte priceType) {
        this.priceType = priceType;
    }

    public Byte getIsCrest() {
        return isCrest;
    }

    public void setIsCrest(Byte isCrest) {
        this.isCrest = isCrest;
    }

    public Date getCrestCreateTime() {
        return crestCreateTime;
    }

    public void setCrestCreateTime(Date crestCreateTime) {
        this.crestCreateTime = crestCreateTime;
    }

    public Date getCrestStartTime() {
        return crestStartTime;
    }

    public void setCrestStartTime(Date crestStartTime) {
        this.crestStartTime = crestStartTime;
    }

    public Date getCrestEndTime() {
        return crestEndTime;
    }

    public void setCrestEndTime(Date crestEndTime) {
        this.crestEndTime = crestEndTime;
    }

    public Byte getCrestStatus() {
        return crestStatus;
    }

    public void setCrestStatus(Byte crestStatus) {
        this.crestStatus = crestStatus;
    }

    public Byte getHasBackground() {
        return hasBackground;
    }

    public void setHasBackground(Byte hasBackground) {
        this.hasBackground = hasBackground;
    }

    public Date getBackgroundCreateTime() {
        return backgroundCreateTime;
    }

    public void setBackgroundCreateTime(Date backgroundCreateTime) {
        this.backgroundCreateTime = backgroundCreateTime;
    }

    public Date getBackgroundStartTime() {
        return backgroundStartTime;
    }

    public void setBackgroundStartTime(Date backgroundStartTime) {
        this.backgroundStartTime = backgroundStartTime;
    }

    public Date getBackgroundEndTime() {
        return backgroundEndTime;
    }

    public void setBackgroundEndTime(Date backgroundEndTime) {
        this.backgroundEndTime = backgroundEndTime;
    }

    public Byte getBackgroundStatus() {
        return backgroundStatus;
    }

    public void setBackgroundStatus(Byte backgroundStatus) {
        this.backgroundStatus = backgroundStatus;
    }

    public Integer getPromotionState() {
        return promotionState;
    }

    public void setPromotionState(Integer promotionState) {
        this.promotionState = promotionState;
    }

    public Byte getConsumeStatus() {
        return consumeStatus;
    }

    public void setConsumeStatus(Byte consumeStatus) {
        this.consumeStatus = consumeStatus;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Integer getFuelType() {
        return fuelType;
    }

    public void setFuelType(Integer fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getInnerColor() {
        return innerColor;
    }

    public void setInnerColor(Integer innerColor) {
        this.innerColor = innerColor;
    }

    public Integer getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(Integer engineSize) {
        this.engineSize = engineSize;
    }

    public String getMd5code() {
        return md5code;
    }

    public void setMd5code(String md5code) {
        this.md5code = md5code == null ? null : md5code.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Short getCountyId() {
        return countyId;
    }

    public void setCountyId(Short countyId) {
        this.countyId = countyId;
    }

    public Short getMarkcountyId() {
        return markcountyId;
    }

    public void setMarkcountyId(Short markcountyId) {
        this.markcountyId = markcountyId;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getUsages() {
        return usages;
    }

    public void setUsages(Integer usages) {
        this.usages = usages;
    }

    public Byte getRepairRecorder() {
        return repairRecorder;
    }

    public void setRepairRecorder(Byte repairRecorder) {
        this.repairRecorder = repairRecorder;
    }

    public Boolean getCredit() {
        return credit;
    }

    public void setCredit(Boolean credit) {
        this.credit = credit;
    }

    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public Integer getIscore() {
        return iscore;
    }

    public void setIscore(Integer iscore) {
        this.iscore = iscore;
    }

    public Byte getTransfer() {
        return transfer;
    }

    public void setTransfer(Byte transfer) {
        this.transfer = transfer;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    public Byte getSubstatus() {
        return substatus;
    }

    public void setSubstatus(Byte substatus) {
        this.substatus = substatus;
    }

    public Byte getBargainsStatus() {
        return bargainsStatus;
    }

    public void setBargainsStatus(Byte bargainsStatus) {
        this.bargainsStatus = bargainsStatus;
    }

    public Byte getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(Byte bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public Byte getDriveType() {
        return driveType;
    }

    public void setDriveType(Byte driveType) {
        this.driveType = driveType;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge == null ? null : badge.trim();
    }

    public Short getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(Short makeYear) {
        this.makeYear = makeYear;
    }

    public Byte getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(Byte serviceCount) {
        this.serviceCount = serviceCount;
    }

    public String getSellingPoint() {
        return sellingPoint;
    }

    public void setSellingPoint(String sellingPoint) {
        this.sellingPoint = sellingPoint == null ? null : sellingPoint.trim();
    }

    public Byte getEmissionStandardId() {
        return emissionStandardId;
    }

    public void setEmissionStandardId(Byte emissionStandardId) {
        this.emissionStandardId = emissionStandardId;
    }

    public Integer getServicebit() {
        return servicebit;
    }

    public void setServicebit(Integer servicebit) {
        this.servicebit = servicebit;
    }

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }

    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode == null ? null : customCode.trim();
    }

    public String getPictureUrls() {
        return pictureUrls;
    }

    public void setPictureUrls(String pictureUrls) {
        this.pictureUrls = pictureUrls == null ? null : pictureUrls.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber == null ? null : invoiceNumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adId=").append(adId);
        sb.append(", orderId=").append(orderId);
        sb.append(", adType=").append(adType);
        sb.append(", userId=").append(userId);
        sb.append(", adminId=").append(adminId);
        sb.append(", scheduleStartDate=").append(scheduleStartDate);
        sb.append(", scheduleEndDate=").append(scheduleEndDate);
        sb.append(", realStartTime=").append(realStartTime);
        sb.append(", realEndTime=").append(realEndTime);
        sb.append(", status=").append(status);
        sb.append(", smallpicUrl=").append(smallpicUrl);
        sb.append(", brandId=").append(brandId);
        sb.append(", modelId=").append(modelId);
        sb.append(", modelchildId=").append(modelchildId);
        sb.append(", nation=").append(nation);
        sb.append(", type=").append(type);
        sb.append(", typeExt=").append(typeExt);
        sb.append(", otherBrandName=").append(otherBrandName);
        sb.append(", otherModelName=").append(otherModelName);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", zoneId=").append(zoneId);
        sb.append(", markprovinceId=").append(markprovinceId);
        sb.append(", markzoneId=").append(markzoneId);
        sb.append(", buyYear=").append(buyYear);
        sb.append(", buyMonth=").append(buyMonth);
        sb.append(", buyDay=").append(buyDay);
        sb.append(", regYear=").append(regYear);
        sb.append(", regMonth=").append(regMonth);
        sb.append(", regDay=").append(regDay);
        sb.append(", dealzoneId=").append(dealzoneId);
        sb.append(", validdays=").append(validdays);
        sb.append(", gearbox=").append(gearbox);
        sb.append(", air=").append(air);
        sb.append(", cylinder=").append(cylinder);
        sb.append(", seating=").append(seating);
        sb.append(", loads=").append(loads);
        sb.append(", airdisplacement=").append(airdisplacement);
        sb.append(", qhcp=").append(qhcp);
        sb.append(", drivingLicense=").append(drivingLicense);
        sb.append(", invoice=").append(invoice);
        sb.append(", surtax=").append(surtax);
        sb.append(", roadtollYear=").append(roadtollYear);
        sb.append(", roadtollMonth=").append(roadtollMonth);
        sb.append(", usetaxYear=").append(usetaxYear);
        sb.append(", usetaxMonth=").append(usetaxMonth);
        sb.append(", insuranceYear=").append(insuranceYear);
        sb.append(", insuranceMonth=").append(insuranceMonth);
        sb.append(", motYear=").append(motYear);
        sb.append(", motMonth=").append(motMonth);
        sb.append(", instalment=").append(instalment);
        sb.append(", config=").append(config);
        sb.append(", color=").append(color);
        sb.append(", colour=").append(colour);
        sb.append(", distance=").append(distance);
        sb.append(", registrationMark=").append(registrationMark);
        sb.append(", price=").append(price);
        sb.append(", contactman=").append(contactman);
        sb.append(", telephone=").append(telephone);
        sb.append(", collectorAdminId=").append(collectorAdminId);
        sb.append(", recordTime=").append(recordTime);
        sb.append(", statusAdminId=").append(statusAdminId);
        sb.append(", statusTime=").append(statusTime);
        sb.append(", companyBranchId=").append(companyBranchId);
        sb.append(", collectionId=").append(collectionId);
        sb.append(", licenseNumber=").append(licenseNumber);
        sb.append(", combo=").append(combo);
        sb.append(", level=").append(level);
        sb.append(", priority=").append(priority);
        sb.append(", vin=").append(vin);
        sb.append(", rank=").append(rank);
        sb.append(", vehicleCondition=").append(vehicleCondition);
        sb.append(", vctypebelong=").append(vctypebelong);
        sb.append(", rbMakecode=").append(rbMakecode);
        sb.append(", rbFamily=").append(rbFamily);
        sb.append(", rbYear=").append(rbYear);
        sb.append(", rbVehiclekey=").append(rbVehiclekey);
        sb.append(", qa=").append(qa);
        sb.append(", authcode=").append(authcode);
        sb.append(", isqa=").append(isqa);
        sb.append(", qasn=").append(qasn);
        sb.append(", payWay=").append(payWay);
        sb.append(", priceType=").append(priceType);
        sb.append(", isCrest=").append(isCrest);
        sb.append(", crestCreateTime=").append(crestCreateTime);
        sb.append(", crestStartTime=").append(crestStartTime);
        sb.append(", crestEndTime=").append(crestEndTime);
        sb.append(", crestStatus=").append(crestStatus);
        sb.append(", hasBackground=").append(hasBackground);
        sb.append(", backgroundCreateTime=").append(backgroundCreateTime);
        sb.append(", backgroundStartTime=").append(backgroundStartTime);
        sb.append(", backgroundEndTime=").append(backgroundEndTime);
        sb.append(", backgroundStatus=").append(backgroundStatus);
        sb.append(", promotionState=").append(promotionState);
        sb.append(", consumeStatus=").append(consumeStatus);
        sb.append(", category=").append(category);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", innerColor=").append(innerColor);
        sb.append(", engineSize=").append(engineSize);
        sb.append(", md5code=").append(md5code);
        sb.append(", brand=").append(brand);
        sb.append(", countyId=").append(countyId);
        sb.append(", markcountyId=").append(markcountyId);
        sb.append(", sex=").append(sex);
        sb.append(", email=").append(email);
        sb.append(", usages=").append(usages);
        sb.append(", repairRecorder=").append(repairRecorder);
        sb.append(", credit=").append(credit);
        sb.append(", score=").append(score);
        sb.append(", iscore=").append(iscore);
        sb.append(", transfer=").append(transfer);
        sb.append(", service=").append(service);
        sb.append(", substatus=").append(substatus);
        sb.append(", bargainsStatus=").append(bargainsStatus);
        sb.append(", bodyStyle=").append(bodyStyle);
        sb.append(", driveType=").append(driveType);
        sb.append(", badge=").append(badge);
        sb.append(", makeYear=").append(makeYear);
        sb.append(", serviceCount=").append(serviceCount);
        sb.append(", sellingPoint=").append(sellingPoint);
        sb.append(", emissionStandardId=").append(emissionStandardId);
        sb.append(", servicebit=").append(servicebit);
        sb.append(", salesId=").append(salesId);
        sb.append(", customCode=").append(customCode);
        sb.append(", pictureUrls=").append(pictureUrls);
        sb.append(", description=").append(description);
        sb.append(", invoiceNumber=").append(invoiceNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        VehicleOrderAdTmp other = (VehicleOrderAdTmp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAdId() == null ? other.getAdId() == null : this.getAdId().equals(other.getAdId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getAdType() == null ? other.getAdType() == null : this.getAdType().equals(other.getAdType()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()))
            && (this.getScheduleStartDate() == null ? other.getScheduleStartDate() == null : this.getScheduleStartDate().equals(other.getScheduleStartDate()))
            && (this.getScheduleEndDate() == null ? other.getScheduleEndDate() == null : this.getScheduleEndDate().equals(other.getScheduleEndDate()))
            && (this.getRealStartTime() == null ? other.getRealStartTime() == null : this.getRealStartTime().equals(other.getRealStartTime()))
            && (this.getRealEndTime() == null ? other.getRealEndTime() == null : this.getRealEndTime().equals(other.getRealEndTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSmallpicUrl() == null ? other.getSmallpicUrl() == null : this.getSmallpicUrl().equals(other.getSmallpicUrl()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getModelId() == null ? other.getModelId() == null : this.getModelId().equals(other.getModelId()))
            && (this.getModelchildId() == null ? other.getModelchildId() == null : this.getModelchildId().equals(other.getModelchildId()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTypeExt() == null ? other.getTypeExt() == null : this.getTypeExt().equals(other.getTypeExt()))
            && (this.getOtherBrandName() == null ? other.getOtherBrandName() == null : this.getOtherBrandName().equals(other.getOtherBrandName()))
            && (this.getOtherModelName() == null ? other.getOtherModelName() == null : this.getOtherModelName().equals(other.getOtherModelName()))
            && (this.getProvinceId() == null ? other.getProvinceId() == null : this.getProvinceId().equals(other.getProvinceId()))
            && (this.getZoneId() == null ? other.getZoneId() == null : this.getZoneId().equals(other.getZoneId()))
            && (this.getMarkprovinceId() == null ? other.getMarkprovinceId() == null : this.getMarkprovinceId().equals(other.getMarkprovinceId()))
            && (this.getMarkzoneId() == null ? other.getMarkzoneId() == null : this.getMarkzoneId().equals(other.getMarkzoneId()))
            && (this.getBuyYear() == null ? other.getBuyYear() == null : this.getBuyYear().equals(other.getBuyYear()))
            && (this.getBuyMonth() == null ? other.getBuyMonth() == null : this.getBuyMonth().equals(other.getBuyMonth()))
            && (this.getBuyDay() == null ? other.getBuyDay() == null : this.getBuyDay().equals(other.getBuyDay()))
            && (this.getRegYear() == null ? other.getRegYear() == null : this.getRegYear().equals(other.getRegYear()))
            && (this.getRegMonth() == null ? other.getRegMonth() == null : this.getRegMonth().equals(other.getRegMonth()))
            && (this.getRegDay() == null ? other.getRegDay() == null : this.getRegDay().equals(other.getRegDay()))
            && (this.getDealzoneId() == null ? other.getDealzoneId() == null : this.getDealzoneId().equals(other.getDealzoneId()))
            && (this.getValiddays() == null ? other.getValiddays() == null : this.getValiddays().equals(other.getValiddays()))
            && (this.getGearbox() == null ? other.getGearbox() == null : this.getGearbox().equals(other.getGearbox()))
            && (this.getAir() == null ? other.getAir() == null : this.getAir().equals(other.getAir()))
            && (this.getCylinder() == null ? other.getCylinder() == null : this.getCylinder().equals(other.getCylinder()))
            && (this.getSeating() == null ? other.getSeating() == null : this.getSeating().equals(other.getSeating()))
            && (this.getLoads() == null ? other.getLoads() == null : this.getLoads().equals(other.getLoads()))
            && (this.getAirdisplacement() == null ? other.getAirdisplacement() == null : this.getAirdisplacement().equals(other.getAirdisplacement()))
            && (this.getQhcp() == null ? other.getQhcp() == null : this.getQhcp().equals(other.getQhcp()))
            && (this.getDrivingLicense() == null ? other.getDrivingLicense() == null : this.getDrivingLicense().equals(other.getDrivingLicense()))
            && (this.getInvoice() == null ? other.getInvoice() == null : this.getInvoice().equals(other.getInvoice()))
            && (this.getSurtax() == null ? other.getSurtax() == null : this.getSurtax().equals(other.getSurtax()))
            && (this.getRoadtollYear() == null ? other.getRoadtollYear() == null : this.getRoadtollYear().equals(other.getRoadtollYear()))
            && (this.getRoadtollMonth() == null ? other.getRoadtollMonth() == null : this.getRoadtollMonth().equals(other.getRoadtollMonth()))
            && (this.getUsetaxYear() == null ? other.getUsetaxYear() == null : this.getUsetaxYear().equals(other.getUsetaxYear()))
            && (this.getUsetaxMonth() == null ? other.getUsetaxMonth() == null : this.getUsetaxMonth().equals(other.getUsetaxMonth()))
            && (this.getInsuranceYear() == null ? other.getInsuranceYear() == null : this.getInsuranceYear().equals(other.getInsuranceYear()))
            && (this.getInsuranceMonth() == null ? other.getInsuranceMonth() == null : this.getInsuranceMonth().equals(other.getInsuranceMonth()))
            && (this.getMotYear() == null ? other.getMotYear() == null : this.getMotYear().equals(other.getMotYear()))
            && (this.getMotMonth() == null ? other.getMotMonth() == null : this.getMotMonth().equals(other.getMotMonth()))
            && (this.getInstalment() == null ? other.getInstalment() == null : this.getInstalment().equals(other.getInstalment()))
            && (this.getConfig() == null ? other.getConfig() == null : this.getConfig().equals(other.getConfig()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getColour() == null ? other.getColour() == null : this.getColour().equals(other.getColour()))
            && (this.getDistance() == null ? other.getDistance() == null : this.getDistance().equals(other.getDistance()))
            && (this.getRegistrationMark() == null ? other.getRegistrationMark() == null : this.getRegistrationMark().equals(other.getRegistrationMark()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getContactman() == null ? other.getContactman() == null : this.getContactman().equals(other.getContactman()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getCollectorAdminId() == null ? other.getCollectorAdminId() == null : this.getCollectorAdminId().equals(other.getCollectorAdminId()))
            && (this.getRecordTime() == null ? other.getRecordTime() == null : this.getRecordTime().equals(other.getRecordTime()))
            && (this.getStatusAdminId() == null ? other.getStatusAdminId() == null : this.getStatusAdminId().equals(other.getStatusAdminId()))
            && (this.getStatusTime() == null ? other.getStatusTime() == null : this.getStatusTime().equals(other.getStatusTime()))
            && (this.getCompanyBranchId() == null ? other.getCompanyBranchId() == null : this.getCompanyBranchId().equals(other.getCompanyBranchId()))
            && (this.getCollectionId() == null ? other.getCollectionId() == null : this.getCollectionId().equals(other.getCollectionId()))
            && (this.getLicenseNumber() == null ? other.getLicenseNumber() == null : this.getLicenseNumber().equals(other.getLicenseNumber()))
            && (this.getCombo() == null ? other.getCombo() == null : this.getCombo().equals(other.getCombo()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getVin() == null ? other.getVin() == null : this.getVin().equals(other.getVin()))
            && (this.getRank() == null ? other.getRank() == null : this.getRank().equals(other.getRank()))
            && (this.getVehicleCondition() == null ? other.getVehicleCondition() == null : this.getVehicleCondition().equals(other.getVehicleCondition()))
            && (this.getVctypebelong() == null ? other.getVctypebelong() == null : this.getVctypebelong().equals(other.getVctypebelong()))
            && (this.getRbMakecode() == null ? other.getRbMakecode() == null : this.getRbMakecode().equals(other.getRbMakecode()))
            && (this.getRbFamily() == null ? other.getRbFamily() == null : this.getRbFamily().equals(other.getRbFamily()))
            && (this.getRbYear() == null ? other.getRbYear() == null : this.getRbYear().equals(other.getRbYear()))
            && (this.getRbVehiclekey() == null ? other.getRbVehiclekey() == null : this.getRbVehiclekey().equals(other.getRbVehiclekey()))
            && (this.getQa() == null ? other.getQa() == null : this.getQa().equals(other.getQa()))
            && (this.getAuthcode() == null ? other.getAuthcode() == null : this.getAuthcode().equals(other.getAuthcode()))
            && (this.getIsqa() == null ? other.getIsqa() == null : this.getIsqa().equals(other.getIsqa()))
            && (this.getQasn() == null ? other.getQasn() == null : this.getQasn().equals(other.getQasn()))
            && (this.getPayWay() == null ? other.getPayWay() == null : this.getPayWay().equals(other.getPayWay()))
            && (this.getPriceType() == null ? other.getPriceType() == null : this.getPriceType().equals(other.getPriceType()))
            && (this.getIsCrest() == null ? other.getIsCrest() == null : this.getIsCrest().equals(other.getIsCrest()))
            && (this.getCrestCreateTime() == null ? other.getCrestCreateTime() == null : this.getCrestCreateTime().equals(other.getCrestCreateTime()))
            && (this.getCrestStartTime() == null ? other.getCrestStartTime() == null : this.getCrestStartTime().equals(other.getCrestStartTime()))
            && (this.getCrestEndTime() == null ? other.getCrestEndTime() == null : this.getCrestEndTime().equals(other.getCrestEndTime()))
            && (this.getCrestStatus() == null ? other.getCrestStatus() == null : this.getCrestStatus().equals(other.getCrestStatus()))
            && (this.getHasBackground() == null ? other.getHasBackground() == null : this.getHasBackground().equals(other.getHasBackground()))
            && (this.getBackgroundCreateTime() == null ? other.getBackgroundCreateTime() == null : this.getBackgroundCreateTime().equals(other.getBackgroundCreateTime()))
            && (this.getBackgroundStartTime() == null ? other.getBackgroundStartTime() == null : this.getBackgroundStartTime().equals(other.getBackgroundStartTime()))
            && (this.getBackgroundEndTime() == null ? other.getBackgroundEndTime() == null : this.getBackgroundEndTime().equals(other.getBackgroundEndTime()))
            && (this.getBackgroundStatus() == null ? other.getBackgroundStatus() == null : this.getBackgroundStatus().equals(other.getBackgroundStatus()))
            && (this.getPromotionState() == null ? other.getPromotionState() == null : this.getPromotionState().equals(other.getPromotionState()))
            && (this.getConsumeStatus() == null ? other.getConsumeStatus() == null : this.getConsumeStatus().equals(other.getConsumeStatus()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getFuelType() == null ? other.getFuelType() == null : this.getFuelType().equals(other.getFuelType()))
            && (this.getInnerColor() == null ? other.getInnerColor() == null : this.getInnerColor().equals(other.getInnerColor()))
            && (this.getEngineSize() == null ? other.getEngineSize() == null : this.getEngineSize().equals(other.getEngineSize()))
            && (this.getMd5code() == null ? other.getMd5code() == null : this.getMd5code().equals(other.getMd5code()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getCountyId() == null ? other.getCountyId() == null : this.getCountyId().equals(other.getCountyId()))
            && (this.getMarkcountyId() == null ? other.getMarkcountyId() == null : this.getMarkcountyId().equals(other.getMarkcountyId()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getUsages() == null ? other.getUsages() == null : this.getUsages().equals(other.getUsages()))
            && (this.getRepairRecorder() == null ? other.getRepairRecorder() == null : this.getRepairRecorder().equals(other.getRepairRecorder()))
            && (this.getCredit() == null ? other.getCredit() == null : this.getCredit().equals(other.getCredit()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getIscore() == null ? other.getIscore() == null : this.getIscore().equals(other.getIscore()))
            && (this.getTransfer() == null ? other.getTransfer() == null : this.getTransfer().equals(other.getTransfer()))
            && (this.getService() == null ? other.getService() == null : this.getService().equals(other.getService()))
            && (this.getSubstatus() == null ? other.getSubstatus() == null : this.getSubstatus().equals(other.getSubstatus()))
            && (this.getBargainsStatus() == null ? other.getBargainsStatus() == null : this.getBargainsStatus().equals(other.getBargainsStatus()))
            && (this.getBodyStyle() == null ? other.getBodyStyle() == null : this.getBodyStyle().equals(other.getBodyStyle()))
            && (this.getDriveType() == null ? other.getDriveType() == null : this.getDriveType().equals(other.getDriveType()))
            && (this.getBadge() == null ? other.getBadge() == null : this.getBadge().equals(other.getBadge()))
            && (this.getMakeYear() == null ? other.getMakeYear() == null : this.getMakeYear().equals(other.getMakeYear()))
            && (this.getServiceCount() == null ? other.getServiceCount() == null : this.getServiceCount().equals(other.getServiceCount()))
            && (this.getSellingPoint() == null ? other.getSellingPoint() == null : this.getSellingPoint().equals(other.getSellingPoint()))
            && (this.getEmissionStandardId() == null ? other.getEmissionStandardId() == null : this.getEmissionStandardId().equals(other.getEmissionStandardId()))
            && (this.getServicebit() == null ? other.getServicebit() == null : this.getServicebit().equals(other.getServicebit()))
            && (this.getSalesId() == null ? other.getSalesId() == null : this.getSalesId().equals(other.getSalesId()))
            && (this.getCustomCode() == null ? other.getCustomCode() == null : this.getCustomCode().equals(other.getCustomCode()))
            && (this.getPictureUrls() == null ? other.getPictureUrls() == null : this.getPictureUrls().equals(other.getPictureUrls()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getInvoiceNumber() == null ? other.getInvoiceNumber() == null : this.getInvoiceNumber().equals(other.getInvoiceNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAdId() == null) ? 0 : getAdId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getAdType() == null) ? 0 : getAdType().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        result = prime * result + ((getScheduleStartDate() == null) ? 0 : getScheduleStartDate().hashCode());
        result = prime * result + ((getScheduleEndDate() == null) ? 0 : getScheduleEndDate().hashCode());
        result = prime * result + ((getRealStartTime() == null) ? 0 : getRealStartTime().hashCode());
        result = prime * result + ((getRealEndTime() == null) ? 0 : getRealEndTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSmallpicUrl() == null) ? 0 : getSmallpicUrl().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getModelId() == null) ? 0 : getModelId().hashCode());
        result = prime * result + ((getModelchildId() == null) ? 0 : getModelchildId().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTypeExt() == null) ? 0 : getTypeExt().hashCode());
        result = prime * result + ((getOtherBrandName() == null) ? 0 : getOtherBrandName().hashCode());
        result = prime * result + ((getOtherModelName() == null) ? 0 : getOtherModelName().hashCode());
        result = prime * result + ((getProvinceId() == null) ? 0 : getProvinceId().hashCode());
        result = prime * result + ((getZoneId() == null) ? 0 : getZoneId().hashCode());
        result = prime * result + ((getMarkprovinceId() == null) ? 0 : getMarkprovinceId().hashCode());
        result = prime * result + ((getMarkzoneId() == null) ? 0 : getMarkzoneId().hashCode());
        result = prime * result + ((getBuyYear() == null) ? 0 : getBuyYear().hashCode());
        result = prime * result + ((getBuyMonth() == null) ? 0 : getBuyMonth().hashCode());
        result = prime * result + ((getBuyDay() == null) ? 0 : getBuyDay().hashCode());
        result = prime * result + ((getRegYear() == null) ? 0 : getRegYear().hashCode());
        result = prime * result + ((getRegMonth() == null) ? 0 : getRegMonth().hashCode());
        result = prime * result + ((getRegDay() == null) ? 0 : getRegDay().hashCode());
        result = prime * result + ((getDealzoneId() == null) ? 0 : getDealzoneId().hashCode());
        result = prime * result + ((getValiddays() == null) ? 0 : getValiddays().hashCode());
        result = prime * result + ((getGearbox() == null) ? 0 : getGearbox().hashCode());
        result = prime * result + ((getAir() == null) ? 0 : getAir().hashCode());
        result = prime * result + ((getCylinder() == null) ? 0 : getCylinder().hashCode());
        result = prime * result + ((getSeating() == null) ? 0 : getSeating().hashCode());
        result = prime * result + ((getLoads() == null) ? 0 : getLoads().hashCode());
        result = prime * result + ((getAirdisplacement() == null) ? 0 : getAirdisplacement().hashCode());
        result = prime * result + ((getQhcp() == null) ? 0 : getQhcp().hashCode());
        result = prime * result + ((getDrivingLicense() == null) ? 0 : getDrivingLicense().hashCode());
        result = prime * result + ((getInvoice() == null) ? 0 : getInvoice().hashCode());
        result = prime * result + ((getSurtax() == null) ? 0 : getSurtax().hashCode());
        result = prime * result + ((getRoadtollYear() == null) ? 0 : getRoadtollYear().hashCode());
        result = prime * result + ((getRoadtollMonth() == null) ? 0 : getRoadtollMonth().hashCode());
        result = prime * result + ((getUsetaxYear() == null) ? 0 : getUsetaxYear().hashCode());
        result = prime * result + ((getUsetaxMonth() == null) ? 0 : getUsetaxMonth().hashCode());
        result = prime * result + ((getInsuranceYear() == null) ? 0 : getInsuranceYear().hashCode());
        result = prime * result + ((getInsuranceMonth() == null) ? 0 : getInsuranceMonth().hashCode());
        result = prime * result + ((getMotYear() == null) ? 0 : getMotYear().hashCode());
        result = prime * result + ((getMotMonth() == null) ? 0 : getMotMonth().hashCode());
        result = prime * result + ((getInstalment() == null) ? 0 : getInstalment().hashCode());
        result = prime * result + ((getConfig() == null) ? 0 : getConfig().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getColour() == null) ? 0 : getColour().hashCode());
        result = prime * result + ((getDistance() == null) ? 0 : getDistance().hashCode());
        result = prime * result + ((getRegistrationMark() == null) ? 0 : getRegistrationMark().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getContactman() == null) ? 0 : getContactman().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getCollectorAdminId() == null) ? 0 : getCollectorAdminId().hashCode());
        result = prime * result + ((getRecordTime() == null) ? 0 : getRecordTime().hashCode());
        result = prime * result + ((getStatusAdminId() == null) ? 0 : getStatusAdminId().hashCode());
        result = prime * result + ((getStatusTime() == null) ? 0 : getStatusTime().hashCode());
        result = prime * result + ((getCompanyBranchId() == null) ? 0 : getCompanyBranchId().hashCode());
        result = prime * result + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        result = prime * result + ((getLicenseNumber() == null) ? 0 : getLicenseNumber().hashCode());
        result = prime * result + ((getCombo() == null) ? 0 : getCombo().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getVin() == null) ? 0 : getVin().hashCode());
        result = prime * result + ((getRank() == null) ? 0 : getRank().hashCode());
        result = prime * result + ((getVehicleCondition() == null) ? 0 : getVehicleCondition().hashCode());
        result = prime * result + ((getVctypebelong() == null) ? 0 : getVctypebelong().hashCode());
        result = prime * result + ((getRbMakecode() == null) ? 0 : getRbMakecode().hashCode());
        result = prime * result + ((getRbFamily() == null) ? 0 : getRbFamily().hashCode());
        result = prime * result + ((getRbYear() == null) ? 0 : getRbYear().hashCode());
        result = prime * result + ((getRbVehiclekey() == null) ? 0 : getRbVehiclekey().hashCode());
        result = prime * result + ((getQa() == null) ? 0 : getQa().hashCode());
        result = prime * result + ((getAuthcode() == null) ? 0 : getAuthcode().hashCode());
        result = prime * result + ((getIsqa() == null) ? 0 : getIsqa().hashCode());
        result = prime * result + ((getQasn() == null) ? 0 : getQasn().hashCode());
        result = prime * result + ((getPayWay() == null) ? 0 : getPayWay().hashCode());
        result = prime * result + ((getPriceType() == null) ? 0 : getPriceType().hashCode());
        result = prime * result + ((getIsCrest() == null) ? 0 : getIsCrest().hashCode());
        result = prime * result + ((getCrestCreateTime() == null) ? 0 : getCrestCreateTime().hashCode());
        result = prime * result + ((getCrestStartTime() == null) ? 0 : getCrestStartTime().hashCode());
        result = prime * result + ((getCrestEndTime() == null) ? 0 : getCrestEndTime().hashCode());
        result = prime * result + ((getCrestStatus() == null) ? 0 : getCrestStatus().hashCode());
        result = prime * result + ((getHasBackground() == null) ? 0 : getHasBackground().hashCode());
        result = prime * result + ((getBackgroundCreateTime() == null) ? 0 : getBackgroundCreateTime().hashCode());
        result = prime * result + ((getBackgroundStartTime() == null) ? 0 : getBackgroundStartTime().hashCode());
        result = prime * result + ((getBackgroundEndTime() == null) ? 0 : getBackgroundEndTime().hashCode());
        result = prime * result + ((getBackgroundStatus() == null) ? 0 : getBackgroundStatus().hashCode());
        result = prime * result + ((getPromotionState() == null) ? 0 : getPromotionState().hashCode());
        result = prime * result + ((getConsumeStatus() == null) ? 0 : getConsumeStatus().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getFuelType() == null) ? 0 : getFuelType().hashCode());
        result = prime * result + ((getInnerColor() == null) ? 0 : getInnerColor().hashCode());
        result = prime * result + ((getEngineSize() == null) ? 0 : getEngineSize().hashCode());
        result = prime * result + ((getMd5code() == null) ? 0 : getMd5code().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getCountyId() == null) ? 0 : getCountyId().hashCode());
        result = prime * result + ((getMarkcountyId() == null) ? 0 : getMarkcountyId().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getUsages() == null) ? 0 : getUsages().hashCode());
        result = prime * result + ((getRepairRecorder() == null) ? 0 : getRepairRecorder().hashCode());
        result = prime * result + ((getCredit() == null) ? 0 : getCredit().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getIscore() == null) ? 0 : getIscore().hashCode());
        result = prime * result + ((getTransfer() == null) ? 0 : getTransfer().hashCode());
        result = prime * result + ((getService() == null) ? 0 : getService().hashCode());
        result = prime * result + ((getSubstatus() == null) ? 0 : getSubstatus().hashCode());
        result = prime * result + ((getBargainsStatus() == null) ? 0 : getBargainsStatus().hashCode());
        result = prime * result + ((getBodyStyle() == null) ? 0 : getBodyStyle().hashCode());
        result = prime * result + ((getDriveType() == null) ? 0 : getDriveType().hashCode());
        result = prime * result + ((getBadge() == null) ? 0 : getBadge().hashCode());
        result = prime * result + ((getMakeYear() == null) ? 0 : getMakeYear().hashCode());
        result = prime * result + ((getServiceCount() == null) ? 0 : getServiceCount().hashCode());
        result = prime * result + ((getSellingPoint() == null) ? 0 : getSellingPoint().hashCode());
        result = prime * result + ((getEmissionStandardId() == null) ? 0 : getEmissionStandardId().hashCode());
        result = prime * result + ((getServicebit() == null) ? 0 : getServicebit().hashCode());
        result = prime * result + ((getSalesId() == null) ? 0 : getSalesId().hashCode());
        result = prime * result + ((getCustomCode() == null) ? 0 : getCustomCode().hashCode());
        result = prime * result + ((getPictureUrls() == null) ? 0 : getPictureUrls().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getInvoiceNumber() == null) ? 0 : getInvoiceNumber().hashCode());
        return result;
    }
}