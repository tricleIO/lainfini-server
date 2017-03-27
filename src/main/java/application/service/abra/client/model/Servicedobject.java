/**
 * ABRA Gen Web API (spojení testapi)
 * Webové API systému 17.03.03
 *
 * OpenAPI spec version: 17.03.03
 * Contact: abragen@abra.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package application.service.abra.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Servicedobject
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Servicedobject   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("DateOfChange")
  private DateTime dateOfChange = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Hidden")
  private Boolean hidden = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Note")
  private String note = null;

  @SerializedName("Firm_ID")
  private String firmID = null;

  @SerializedName("FirmOffice_ID")
  private String firmOfficeID = null;

  @SerializedName("Person_ID")
  private String personID = null;

  @SerializedName("OwnerFirm_ID")
  private String ownerFirmID = null;

  @SerializedName("PayerFirm_ID")
  private String payerFirmID = null;

  @SerializedName("PayerFirmOffice_ID")
  private String payerFirmOfficeID = null;

  @SerializedName("PayerPerson_ID")
  private String payerPersonID = null;

  @SerializedName("InformClientKind")
  private Integer informClientKind = null;

  @SerializedName("ProductionYear")
  private Integer productionYear = null;

  @SerializedName("DateOfSale$DATE")
  private DateTime dateOfSaleDATE = null;

  @SerializedName("GuaranteeEndDate$DATE")
  private DateTime guaranteeEndDateDATE = null;

  @SerializedName("ExtendedGuaranteeEndDate$DATE")
  private DateTime extendedGuaranteeEndDateDATE = null;

  @SerializedName("NextContactDate1$DATE")
  private DateTime nextContactDate1DATE = null;

  @SerializedName("NextContactDate2$DATE")
  private DateTime nextContactDate2DATE = null;

  @SerializedName("StoreCard_ID")
  private String storeCardID = null;

  @SerializedName("StoreBatch_ID")
  private String storeBatchID = null;

  @SerializedName("ServicedObjectType_ID")
  private String servicedObjectTypeID = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("OutdoorPlaceDescription")
  private String outdoorPlaceDescription = null;

  @SerializedName("PlaceAddress_ID")
  private Servicedobject placeAddressID = null;

  @SerializedName("CorrectedBy_ID")
  private String correctedByID = null;

  @SerializedName("CorrectedDate$DATE")
  private DateTime correctedDateDATE = null;

  @SerializedName("PaymentTypeDefault")
  private Integer paymentTypeDefault = null;

  @SerializedName("MaxDuration")
  private Double maxDuration = null;

  @SerializedName("BusOrder_ID")
  private String busOrderID = null;

  @SerializedName("BusTransaction_ID")
  private String busTransactionID = null;

  @SerializedName("BusProject_ID")
  private String busProjectID = null;

  @SerializedName("Pictures")
  private List<Servicedobjectpicture> pictures = new ArrayList<Servicedobjectpicture>();

   /**
   * Název
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Název")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Vlastní ID [persistentní položka]
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "Vlastní ID [persistentní položka]")
  public String getID() {
    return ID;
  }

  public Servicedobject dateOfChange(DateTime dateOfChange) {
    this.dateOfChange = dateOfChange;
    return this;
  }

   /**
   * Datum změny
   * @return dateOfChange
  **/
  @ApiModelProperty(example = "null", value = "Datum změny")
  public DateTime getDateOfChange() {
    return dateOfChange;
  }

  public void setDateOfChange(DateTime dateOfChange) {
    this.dateOfChange = dateOfChange;
  }

   /**
   * ID třídy
   * @return classID
  **/
  @ApiModelProperty(example = "null", value = "ID třídy")
  public String getClassID() {
    return classID;
  }

   /**
   * Verze objektu [persistentní položka]
   * @return objVersion
  **/
  @ApiModelProperty(example = "null", value = "Verze objektu [persistentní položka]")
  public Integer getObjVersion() {
    return objVersion;
  }

  public Servicedobject hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "Skrytý [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Servicedobject parentID(String parentID) {
    this.parentID = parentID;
    return this;
  }

   /**
   * Nadřízený; ID objektu Servisovaný předmět [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Nadřízený; ID objektu Servisovaný předmět [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public void setParentID(String parentID) {
    this.parentID = parentID;
  }

  public Servicedobject code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Servicedobject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Servicedobject note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Poznámka [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "Poznámka [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Servicedobject firmID(String firmID) {
    this.firmID = firmID;
    return this;
  }

   /**
   * Firma; ID objektu Firma [persistentní položka]
   * @return firmID
  **/
  @ApiModelProperty(example = "null", value = "Firma; ID objektu Firma [persistentní položka]")
  public String getFirmID() {
    return firmID;
  }

  public void setFirmID(String firmID) {
    this.firmID = firmID;
  }

  public Servicedobject firmOfficeID(String firmOfficeID) {
    this.firmOfficeID = firmOfficeID;
    return this;
  }

   /**
   * Provozovna; ID objektu Provozovna [persistentní položka]
   * @return firmOfficeID
  **/
  @ApiModelProperty(example = "null", value = "Provozovna; ID objektu Provozovna [persistentní položka]")
  public String getFirmOfficeID() {
    return firmOfficeID;
  }

  public void setFirmOfficeID(String firmOfficeID) {
    this.firmOfficeID = firmOfficeID;
  }

  public Servicedobject personID(String personID) {
    this.personID = personID;
    return this;
  }

   /**
   * Osoba; ID objektu Osoba [persistentní položka]
   * @return personID
  **/
  @ApiModelProperty(example = "null", value = "Osoba; ID objektu Osoba [persistentní položka]")
  public String getPersonID() {
    return personID;
  }

  public void setPersonID(String personID) {
    this.personID = personID;
  }

  public Servicedobject ownerFirmID(String ownerFirmID) {
    this.ownerFirmID = ownerFirmID;
    return this;
  }

   /**
   * Firma vlastníka; ID objektu Firma [persistentní položka]
   * @return ownerFirmID
  **/
  @ApiModelProperty(example = "null", value = "Firma vlastníka; ID objektu Firma [persistentní položka]")
  public String getOwnerFirmID() {
    return ownerFirmID;
  }

  public void setOwnerFirmID(String ownerFirmID) {
    this.ownerFirmID = ownerFirmID;
  }

  public Servicedobject payerFirmID(String payerFirmID) {
    this.payerFirmID = payerFirmID;
    return this;
  }

   /**
   * Firma plátce; ID objektu Firma [persistentní položka]
   * @return payerFirmID
  **/
  @ApiModelProperty(example = "null", value = "Firma plátce; ID objektu Firma [persistentní položka]")
  public String getPayerFirmID() {
    return payerFirmID;
  }

  public void setPayerFirmID(String payerFirmID) {
    this.payerFirmID = payerFirmID;
  }

  public Servicedobject payerFirmOfficeID(String payerFirmOfficeID) {
    this.payerFirmOfficeID = payerFirmOfficeID;
    return this;
  }

   /**
   * Provozovna plátce; ID objektu Provozovna [persistentní položka]
   * @return payerFirmOfficeID
  **/
  @ApiModelProperty(example = "null", value = "Provozovna plátce; ID objektu Provozovna [persistentní položka]")
  public String getPayerFirmOfficeID() {
    return payerFirmOfficeID;
  }

  public void setPayerFirmOfficeID(String payerFirmOfficeID) {
    this.payerFirmOfficeID = payerFirmOfficeID;
  }

  public Servicedobject payerPersonID(String payerPersonID) {
    this.payerPersonID = payerPersonID;
    return this;
  }

   /**
   * Osoba plátce; ID objektu Osoba [persistentní položka]
   * @return payerPersonID
  **/
  @ApiModelProperty(example = "null", value = "Osoba plátce; ID objektu Osoba [persistentní položka]")
  public String getPayerPersonID() {
    return payerPersonID;
  }

  public void setPayerPersonID(String payerPersonID) {
    this.payerPersonID = payerPersonID;
  }

  public Servicedobject informClientKind(Integer informClientKind) {
    this.informClientKind = informClientKind;
    return this;
  }

   /**
   * Způsob informování [persistentní položka]
   * @return informClientKind
  **/
  @ApiModelProperty(example = "null", value = "Způsob informování [persistentní položka]")
  public Integer getInformClientKind() {
    return informClientKind;
  }

  public void setInformClientKind(Integer informClientKind) {
    this.informClientKind = informClientKind;
  }

  public Servicedobject productionYear(Integer productionYear) {
    this.productionYear = productionYear;
    return this;
  }

   /**
   * Rok výroby [persistentní položka]
   * @return productionYear
  **/
  @ApiModelProperty(example = "null", value = "Rok výroby [persistentní položka]")
  public Integer getProductionYear() {
    return productionYear;
  }

  public void setProductionYear(Integer productionYear) {
    this.productionYear = productionYear;
  }

  public Servicedobject dateOfSaleDATE(DateTime dateOfSaleDATE) {
    this.dateOfSaleDATE = dateOfSaleDATE;
    return this;
  }

   /**
   * Datum prodeje [persistentní položka]
   * @return dateOfSaleDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum prodeje [persistentní položka]")
  public DateTime getDateOfSaleDATE() {
    return dateOfSaleDATE;
  }

  public void setDateOfSaleDATE(DateTime dateOfSaleDATE) {
    this.dateOfSaleDATE = dateOfSaleDATE;
  }

  public Servicedobject guaranteeEndDateDATE(DateTime guaranteeEndDateDATE) {
    this.guaranteeEndDateDATE = guaranteeEndDateDATE;
    return this;
  }

   /**
   * Záruka do [persistentní položka]
   * @return guaranteeEndDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Záruka do [persistentní položka]")
  public DateTime getGuaranteeEndDateDATE() {
    return guaranteeEndDateDATE;
  }

  public void setGuaranteeEndDateDATE(DateTime guaranteeEndDateDATE) {
    this.guaranteeEndDateDATE = guaranteeEndDateDATE;
  }

  public Servicedobject extendedGuaranteeEndDateDATE(DateTime extendedGuaranteeEndDateDATE) {
    this.extendedGuaranteeEndDateDATE = extendedGuaranteeEndDateDATE;
    return this;
  }

   /**
   * Prodl.záruka do [persistentní položka]
   * @return extendedGuaranteeEndDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Prodl.záruka do [persistentní položka]")
  public DateTime getExtendedGuaranteeEndDateDATE() {
    return extendedGuaranteeEndDateDATE;
  }

  public void setExtendedGuaranteeEndDateDATE(DateTime extendedGuaranteeEndDateDATE) {
    this.extendedGuaranteeEndDateDATE = extendedGuaranteeEndDateDATE;
  }

  public Servicedobject nextContactDate1DATE(DateTime nextContactDate1DATE) {
    this.nextContactDate1DATE = nextContactDate1DATE;
    return this;
  }

   /**
   * Kontaktovat1 [persistentní položka]
   * @return nextContactDate1DATE
  **/
  @ApiModelProperty(example = "null", value = "Kontaktovat1 [persistentní položka]")
  public DateTime getNextContactDate1DATE() {
    return nextContactDate1DATE;
  }

  public void setNextContactDate1DATE(DateTime nextContactDate1DATE) {
    this.nextContactDate1DATE = nextContactDate1DATE;
  }

  public Servicedobject nextContactDate2DATE(DateTime nextContactDate2DATE) {
    this.nextContactDate2DATE = nextContactDate2DATE;
    return this;
  }

   /**
   * Kontaktovat2 [persistentní položka]
   * @return nextContactDate2DATE
  **/
  @ApiModelProperty(example = "null", value = "Kontaktovat2 [persistentní položka]")
  public DateTime getNextContactDate2DATE() {
    return nextContactDate2DATE;
  }

  public void setNextContactDate2DATE(DateTime nextContactDate2DATE) {
    this.nextContactDate2DATE = nextContactDate2DATE;
  }

  public Servicedobject storeCardID(String storeCardID) {
    this.storeCardID = storeCardID;
    return this;
  }

   /**
   * Skladová karta; ID objektu Skladová karta [persistentní položka]
   * @return storeCardID
  **/
  @ApiModelProperty(example = "null", value = "Skladová karta; ID objektu Skladová karta [persistentní položka]")
  public String getStoreCardID() {
    return storeCardID;
  }

  public void setStoreCardID(String storeCardID) {
    this.storeCardID = storeCardID;
  }

  public Servicedobject storeBatchID(String storeBatchID) {
    this.storeBatchID = storeBatchID;
    return this;
  }

   /**
   * Sériové číslo; ID objektu Šarže/sériové číslo [persistentní položka]
   * @return storeBatchID
  **/
  @ApiModelProperty(example = "null", value = "Sériové číslo; ID objektu Šarže/sériové číslo [persistentní položka]")
  public String getStoreBatchID() {
    return storeBatchID;
  }

  public void setStoreBatchID(String storeBatchID) {
    this.storeBatchID = storeBatchID;
  }

  public Servicedobject servicedObjectTypeID(String servicedObjectTypeID) {
    this.servicedObjectTypeID = servicedObjectTypeID;
    return this;
  }

   /**
   * Model; ID objektu Model servisovaného předmětu [persistentní položka]
   * @return servicedObjectTypeID
  **/
  @ApiModelProperty(example = "null", value = "Model; ID objektu Model servisovaného předmětu [persistentní položka]")
  public String getServicedObjectTypeID() {
    return servicedObjectTypeID;
  }

  public void setServicedObjectTypeID(String servicedObjectTypeID) {
    this.servicedObjectTypeID = servicedObjectTypeID;
  }

  public Servicedobject priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Priorita [persistentní položka]
   * @return priority
  **/
  @ApiModelProperty(example = "null", value = "Priorita [persistentní položka]")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Servicedobject outdoorPlaceDescription(String outdoorPlaceDescription) {
    this.outdoorPlaceDescription = outdoorPlaceDescription;
    return this;
  }

   /**
   * Místo u klienta [persistentní položka]
   * @return outdoorPlaceDescription
  **/
  @ApiModelProperty(example = "null", value = "Místo u klienta [persistentní položka]")
  public String getOutdoorPlaceDescription() {
    return outdoorPlaceDescription;
  }

  public void setOutdoorPlaceDescription(String outdoorPlaceDescription) {
    this.outdoorPlaceDescription = outdoorPlaceDescription;
  }

  public Servicedobject placeAddressID(Servicedobject placeAddressID) {
    this.placeAddressID = placeAddressID;
    return this;
  }

   /**
   * Get placeAddressID
   * @return placeAddressID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Servicedobject getPlaceAddressID() {
    return placeAddressID;
  }

  public void setPlaceAddressID(Servicedobject placeAddressID) {
    this.placeAddressID = placeAddressID;
  }

  public Servicedobject correctedByID(String correctedByID) {
    this.correctedByID = correctedByID;
    return this;
  }

   /**
   * Změnil; ID objektu Uživatel [persistentní položka]
   * @return correctedByID
  **/
  @ApiModelProperty(example = "null", value = "Změnil; ID objektu Uživatel [persistentní položka]")
  public String getCorrectedByID() {
    return correctedByID;
  }

  public void setCorrectedByID(String correctedByID) {
    this.correctedByID = correctedByID;
  }

  public Servicedobject correctedDateDATE(DateTime correctedDateDATE) {
    this.correctedDateDATE = correctedDateDATE;
    return this;
  }

   /**
   * Datum změny [persistentní položka]
   * @return correctedDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum změny [persistentní položka]")
  public DateTime getCorrectedDateDATE() {
    return correctedDateDATE;
  }

  public void setCorrectedDateDATE(DateTime correctedDateDATE) {
    this.correctedDateDATE = correctedDateDATE;
  }

  public Servicedobject paymentTypeDefault(Integer paymentTypeDefault) {
    this.paymentTypeDefault = paymentTypeDefault;
    return this;
  }

   /**
   * Výchozí způsob platby [persistentní položka]
   * @return paymentTypeDefault
  **/
  @ApiModelProperty(example = "null", value = "Výchozí způsob platby [persistentní položka]")
  public Integer getPaymentTypeDefault() {
    return paymentTypeDefault;
  }

  public void setPaymentTypeDefault(Integer paymentTypeDefault) {
    this.paymentTypeDefault = paymentTypeDefault;
  }

  public Servicedobject maxDuration(Double maxDuration) {
    this.maxDuration = maxDuration;
    return this;
  }

   /**
   * Max.délka trvání opravy [persistentní položka]
   * @return maxDuration
  **/
  @ApiModelProperty(example = "null", value = "Max.délka trvání opravy [persistentní položka]")
  public Double getMaxDuration() {
    return maxDuration;
  }

  public void setMaxDuration(Double maxDuration) {
    this.maxDuration = maxDuration;
  }

  public Servicedobject busOrderID(String busOrderID) {
    this.busOrderID = busOrderID;
    return this;
  }

   /**
   * Zakázka; ID objektu Zakázka [persistentní položka]
   * @return busOrderID
  **/
  @ApiModelProperty(example = "null", value = "Zakázka; ID objektu Zakázka [persistentní položka]")
  public String getBusOrderID() {
    return busOrderID;
  }

  public void setBusOrderID(String busOrderID) {
    this.busOrderID = busOrderID;
  }

  public Servicedobject busTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
    return this;
  }

   /**
   * Obchodní případ; ID objektu Obchodní případ [persistentní položka]
   * @return busTransactionID
  **/
  @ApiModelProperty(example = "null", value = "Obchodní případ; ID objektu Obchodní případ [persistentní položka]")
  public String getBusTransactionID() {
    return busTransactionID;
  }

  public void setBusTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
  }

  public Servicedobject busProjectID(String busProjectID) {
    this.busProjectID = busProjectID;
    return this;
  }

   /**
   * Projekt; ID objektu Projekt [persistentní položka]
   * @return busProjectID
  **/
  @ApiModelProperty(example = "null", value = "Projekt; ID objektu Projekt [persistentní položka]")
  public String getBusProjectID() {
    return busProjectID;
  }

  public void setBusProjectID(String busProjectID) {
    this.busProjectID = busProjectID;
  }

  public Servicedobject pictures(List<Servicedobjectpicture> pictures) {
    this.pictures = pictures;
    return this;
  }

  public Servicedobject addPicturesItem(Servicedobjectpicture picturesItem) {
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * Obrázek; kolekce BO Obrázek k serv.předmětu [nepersistentní položka]
   * @return pictures
  **/
  @ApiModelProperty(example = "null", value = "Obrázek; kolekce BO Obrázek k serv.předmětu [nepersistentní položka]")
  public List<Servicedobjectpicture> getPictures() {
    return pictures;
  }

  public void setPictures(List<Servicedobjectpicture> pictures) {
    this.pictures = pictures;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servicedobject servicedobject = (Servicedobject) o;
    return Objects.equals(this.displayName, servicedobject.displayName) &&
        Objects.equals(this.ID, servicedobject.ID) &&
        Objects.equals(this.dateOfChange, servicedobject.dateOfChange) &&
        Objects.equals(this.classID, servicedobject.classID) &&
        Objects.equals(this.objVersion, servicedobject.objVersion) &&
        Objects.equals(this.hidden, servicedobject.hidden) &&
        Objects.equals(this.parentID, servicedobject.parentID) &&
        Objects.equals(this.code, servicedobject.code) &&
        Objects.equals(this.name, servicedobject.name) &&
        Objects.equals(this.note, servicedobject.note) &&
        Objects.equals(this.firmID, servicedobject.firmID) &&
        Objects.equals(this.firmOfficeID, servicedobject.firmOfficeID) &&
        Objects.equals(this.personID, servicedobject.personID) &&
        Objects.equals(this.ownerFirmID, servicedobject.ownerFirmID) &&
        Objects.equals(this.payerFirmID, servicedobject.payerFirmID) &&
        Objects.equals(this.payerFirmOfficeID, servicedobject.payerFirmOfficeID) &&
        Objects.equals(this.payerPersonID, servicedobject.payerPersonID) &&
        Objects.equals(this.informClientKind, servicedobject.informClientKind) &&
        Objects.equals(this.productionYear, servicedobject.productionYear) &&
        Objects.equals(this.dateOfSaleDATE, servicedobject.dateOfSaleDATE) &&
        Objects.equals(this.guaranteeEndDateDATE, servicedobject.guaranteeEndDateDATE) &&
        Objects.equals(this.extendedGuaranteeEndDateDATE, servicedobject.extendedGuaranteeEndDateDATE) &&
        Objects.equals(this.nextContactDate1DATE, servicedobject.nextContactDate1DATE) &&
        Objects.equals(this.nextContactDate2DATE, servicedobject.nextContactDate2DATE) &&
        Objects.equals(this.storeCardID, servicedobject.storeCardID) &&
        Objects.equals(this.storeBatchID, servicedobject.storeBatchID) &&
        Objects.equals(this.servicedObjectTypeID, servicedobject.servicedObjectTypeID) &&
        Objects.equals(this.priority, servicedobject.priority) &&
        Objects.equals(this.outdoorPlaceDescription, servicedobject.outdoorPlaceDescription) &&
        Objects.equals(this.placeAddressID, servicedobject.placeAddressID) &&
        Objects.equals(this.correctedByID, servicedobject.correctedByID) &&
        Objects.equals(this.correctedDateDATE, servicedobject.correctedDateDATE) &&
        Objects.equals(this.paymentTypeDefault, servicedobject.paymentTypeDefault) &&
        Objects.equals(this.maxDuration, servicedobject.maxDuration) &&
        Objects.equals(this.busOrderID, servicedobject.busOrderID) &&
        Objects.equals(this.busTransactionID, servicedobject.busTransactionID) &&
        Objects.equals(this.busProjectID, servicedobject.busProjectID) &&
        Objects.equals(this.pictures, servicedobject.pictures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, dateOfChange, classID, objVersion, hidden, parentID, code, name, note, firmID, firmOfficeID, personID, ownerFirmID, payerFirmID, payerFirmOfficeID, payerPersonID, informClientKind, productionYear, dateOfSaleDATE, guaranteeEndDateDATE, extendedGuaranteeEndDateDATE, nextContactDate1DATE, nextContactDate2DATE, storeCardID, storeBatchID, servicedObjectTypeID, priority, outdoorPlaceDescription, placeAddressID, correctedByID, correctedDateDATE, paymentTypeDefault, maxDuration, busOrderID, busTransactionID, busProjectID, pictures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servicedobject {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    dateOfChange: ").append(toIndentedString(dateOfChange)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    firmID: ").append(toIndentedString(firmID)).append("\n");
    sb.append("    firmOfficeID: ").append(toIndentedString(firmOfficeID)).append("\n");
    sb.append("    personID: ").append(toIndentedString(personID)).append("\n");
    sb.append("    ownerFirmID: ").append(toIndentedString(ownerFirmID)).append("\n");
    sb.append("    payerFirmID: ").append(toIndentedString(payerFirmID)).append("\n");
    sb.append("    payerFirmOfficeID: ").append(toIndentedString(payerFirmOfficeID)).append("\n");
    sb.append("    payerPersonID: ").append(toIndentedString(payerPersonID)).append("\n");
    sb.append("    informClientKind: ").append(toIndentedString(informClientKind)).append("\n");
    sb.append("    productionYear: ").append(toIndentedString(productionYear)).append("\n");
    sb.append("    dateOfSaleDATE: ").append(toIndentedString(dateOfSaleDATE)).append("\n");
    sb.append("    guaranteeEndDateDATE: ").append(toIndentedString(guaranteeEndDateDATE)).append("\n");
    sb.append("    extendedGuaranteeEndDateDATE: ").append(toIndentedString(extendedGuaranteeEndDateDATE)).append("\n");
    sb.append("    nextContactDate1DATE: ").append(toIndentedString(nextContactDate1DATE)).append("\n");
    sb.append("    nextContactDate2DATE: ").append(toIndentedString(nextContactDate2DATE)).append("\n");
    sb.append("    storeCardID: ").append(toIndentedString(storeCardID)).append("\n");
    sb.append("    storeBatchID: ").append(toIndentedString(storeBatchID)).append("\n");
    sb.append("    servicedObjectTypeID: ").append(toIndentedString(servicedObjectTypeID)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    outdoorPlaceDescription: ").append(toIndentedString(outdoorPlaceDescription)).append("\n");
    sb.append("    placeAddressID: ").append(toIndentedString(placeAddressID)).append("\n");
    sb.append("    correctedByID: ").append(toIndentedString(correctedByID)).append("\n");
    sb.append("    correctedDateDATE: ").append(toIndentedString(correctedDateDATE)).append("\n");
    sb.append("    paymentTypeDefault: ").append(toIndentedString(paymentTypeDefault)).append("\n");
    sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
    sb.append("    busOrderID: ").append(toIndentedString(busOrderID)).append("\n");
    sb.append("    busTransactionID: ").append(toIndentedString(busTransactionID)).append("\n");
    sb.append("    busProjectID: ").append(toIndentedString(busProjectID)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

