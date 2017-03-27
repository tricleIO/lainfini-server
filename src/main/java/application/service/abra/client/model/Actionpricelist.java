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
 * Actionpricelist
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Actionpricelist   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Hidden")
  private Boolean hidden = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Note")
  private String note = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("ManagedBy_ID")
  private String managedByID = null;

  @SerializedName("CreationDate$DATE")
  private DateTime creationDateDATE = null;

  @SerializedName("DealerDiscountExcluded")
  private Boolean dealerDiscountExcluded = null;

  @SerializedName("IndividualDiscountExcluded")
  private Boolean individualDiscountExcluded = null;

  @SerializedName("FinancialDiscountExcluded")
  private Boolean financialDiscountExcluded = null;

  @SerializedName("QuantityDiscountExcluded")
  private Boolean quantityDiscountExcluded = null;

  @SerializedName("DocumentDiscountExcluded")
  private Boolean documentDiscountExcluded = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("DateFrom$DATE")
  private DateTime dateFromDATE = null;

  @SerializedName("DateTo$DATE")
  private DateTime dateToDATE = null;

  @SerializedName("ByTime")
  private Boolean byTime = null;

  @SerializedName("TimeFrom")
  private DateTime timeFrom = null;

  @SerializedName("TimeTo")
  private DateTime timeTo = null;

  @SerializedName("ByDateOfWeek")
  private Boolean byDateOfWeek = null;

  @SerializedName("Monday")
  private Boolean monday = null;

  @SerializedName("Tuesday")
  private Boolean tuesday = null;

  @SerializedName("Wednesday")
  private Boolean wednesday = null;

  @SerializedName("Thursday")
  private Boolean thursday = null;

  @SerializedName("Friday")
  private Boolean friday = null;

  @SerializedName("Saturday")
  private Boolean saturday = null;

  @SerializedName("Sunday")
  private Boolean sunday = null;

  @SerializedName("PriceListRoundings")
  private List<Actionpricelistrounding> priceListRoundings = new ArrayList<Actionpricelistrounding>();

  @SerializedName("RestrictionUses")
  private List<Actionpricelistrestrictionuse> restrictionUses = new ArrayList<Actionpricelistrestrictionuse>();

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

  public Actionpricelist hidden(Boolean hidden) {
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

  public Actionpricelist code(String code) {
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

  public Actionpricelist name(String name) {
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

  public Actionpricelist note(String note) {
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

  public Actionpricelist comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Poznámka
   * @return comment
  **/
  @ApiModelProperty(example = "null", value = "Poznámka")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Actionpricelist managedByID(String managedByID) {
    this.managedByID = managedByID;
    return this;
  }

   /**
   * Správce ceníku; ID objektu Uživatel [persistentní položka]
   * @return managedByID
  **/
  @ApiModelProperty(example = "null", value = "Správce ceníku; ID objektu Uživatel [persistentní položka]")
  public String getManagedByID() {
    return managedByID;
  }

  public void setManagedByID(String managedByID) {
    this.managedByID = managedByID;
  }

  public Actionpricelist creationDateDATE(DateTime creationDateDATE) {
    this.creationDateDATE = creationDateDATE;
    return this;
  }

   /**
   * Datum vytvoření ceníku [persistentní položka]
   * @return creationDateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum vytvoření ceníku [persistentní položka]")
  public DateTime getCreationDateDATE() {
    return creationDateDATE;
  }

  public void setCreationDateDATE(DateTime creationDateDATE) {
    this.creationDateDATE = creationDateDATE;
  }

  public Actionpricelist dealerDiscountExcluded(Boolean dealerDiscountExcluded) {
    this.dealerDiscountExcluded = dealerDiscountExcluded;
    return this;
  }

   /**
   * Neuplatňovat dealerské slevy [persistentní položka]
   * @return dealerDiscountExcluded
  **/
  @ApiModelProperty(example = "null", value = "Neuplatňovat dealerské slevy [persistentní položka]")
  public Boolean getDealerDiscountExcluded() {
    return dealerDiscountExcluded;
  }

  public void setDealerDiscountExcluded(Boolean dealerDiscountExcluded) {
    this.dealerDiscountExcluded = dealerDiscountExcluded;
  }

  public Actionpricelist individualDiscountExcluded(Boolean individualDiscountExcluded) {
    this.individualDiscountExcluded = individualDiscountExcluded;
    return this;
  }

   /**
   * Neuplatňovat individuální slevy [persistentní položka]
   * @return individualDiscountExcluded
  **/
  @ApiModelProperty(example = "null", value = "Neuplatňovat individuální slevy [persistentní položka]")
  public Boolean getIndividualDiscountExcluded() {
    return individualDiscountExcluded;
  }

  public void setIndividualDiscountExcluded(Boolean individualDiscountExcluded) {
    this.individualDiscountExcluded = individualDiscountExcluded;
  }

  public Actionpricelist financialDiscountExcluded(Boolean financialDiscountExcluded) {
    this.financialDiscountExcluded = financialDiscountExcluded;
    return this;
  }

   /**
   * Neuplatňovat finanční slevy [persistentní položka]
   * @return financialDiscountExcluded
  **/
  @ApiModelProperty(example = "null", value = "Neuplatňovat finanční slevy [persistentní položka]")
  public Boolean getFinancialDiscountExcluded() {
    return financialDiscountExcluded;
  }

  public void setFinancialDiscountExcluded(Boolean financialDiscountExcluded) {
    this.financialDiscountExcluded = financialDiscountExcluded;
  }

  public Actionpricelist quantityDiscountExcluded(Boolean quantityDiscountExcluded) {
    this.quantityDiscountExcluded = quantityDiscountExcluded;
    return this;
  }

   /**
   * Neuplatňovat množstevní slevy [persistentní položka]
   * @return quantityDiscountExcluded
  **/
  @ApiModelProperty(example = "null", value = "Neuplatňovat množstevní slevy [persistentní položka]")
  public Boolean getQuantityDiscountExcluded() {
    return quantityDiscountExcluded;
  }

  public void setQuantityDiscountExcluded(Boolean quantityDiscountExcluded) {
    this.quantityDiscountExcluded = quantityDiscountExcluded;
  }

  public Actionpricelist documentDiscountExcluded(Boolean documentDiscountExcluded) {
    this.documentDiscountExcluded = documentDiscountExcluded;
    return this;
  }

   /**
   * Vyloučeno z dodatečné slevy [persistentní položka]
   * @return documentDiscountExcluded
  **/
  @ApiModelProperty(example = "null", value = "Vyloučeno z dodatečné slevy [persistentní položka]")
  public Boolean getDocumentDiscountExcluded() {
    return documentDiscountExcluded;
  }

  public void setDocumentDiscountExcluded(Boolean documentDiscountExcluded) {
    this.documentDiscountExcluded = documentDiscountExcluded;
  }

  public Actionpricelist priority(Integer priority) {
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

  public Actionpricelist dateFromDATE(DateTime dateFromDATE) {
    this.dateFromDATE = dateFromDATE;
    return this;
  }

   /**
   * Datum platnosti od [persistentní položka]
   * @return dateFromDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum platnosti od [persistentní položka]")
  public DateTime getDateFromDATE() {
    return dateFromDATE;
  }

  public void setDateFromDATE(DateTime dateFromDATE) {
    this.dateFromDATE = dateFromDATE;
  }

  public Actionpricelist dateToDATE(DateTime dateToDATE) {
    this.dateToDATE = dateToDATE;
    return this;
  }

   /**
   * Datum platnosti do [persistentní položka]
   * @return dateToDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum platnosti do [persistentní položka]")
  public DateTime getDateToDATE() {
    return dateToDATE;
  }

  public void setDateToDATE(DateTime dateToDATE) {
    this.dateToDATE = dateToDATE;
  }

  public Actionpricelist byTime(Boolean byTime) {
    this.byTime = byTime;
    return this;
  }

   /**
   * Omezovat časovým omezením [persistentní položka]
   * @return byTime
  **/
  @ApiModelProperty(example = "null", value = "Omezovat časovým omezením [persistentní položka]")
  public Boolean getByTime() {
    return byTime;
  }

  public void setByTime(Boolean byTime) {
    this.byTime = byTime;
  }

  public Actionpricelist timeFrom(DateTime timeFrom) {
    this.timeFrom = timeFrom;
    return this;
  }

   /**
   * čas od [persistentní položka]
   * @return timeFrom
  **/
  @ApiModelProperty(example = "null", value = "čas od [persistentní položka]")
  public DateTime getTimeFrom() {
    return timeFrom;
  }

  public void setTimeFrom(DateTime timeFrom) {
    this.timeFrom = timeFrom;
  }

  public Actionpricelist timeTo(DateTime timeTo) {
    this.timeTo = timeTo;
    return this;
  }

   /**
   * čas do [persistentní položka]
   * @return timeTo
  **/
  @ApiModelProperty(example = "null", value = "čas do [persistentní položka]")
  public DateTime getTimeTo() {
    return timeTo;
  }

  public void setTimeTo(DateTime timeTo) {
    this.timeTo = timeTo;
  }

  public Actionpricelist byDateOfWeek(Boolean byDateOfWeek) {
    this.byDateOfWeek = byDateOfWeek;
    return this;
  }

   /**
   * Omezovat omezením dne v týdnu [persistentní položka]
   * @return byDateOfWeek
  **/
  @ApiModelProperty(example = "null", value = "Omezovat omezením dne v týdnu [persistentní položka]")
  public Boolean getByDateOfWeek() {
    return byDateOfWeek;
  }

  public void setByDateOfWeek(Boolean byDateOfWeek) {
    this.byDateOfWeek = byDateOfWeek;
  }

  public Actionpricelist monday(Boolean monday) {
    this.monday = monday;
    return this;
  }

   /**
   * Pondělí [persistentní položka]
   * @return monday
  **/
  @ApiModelProperty(example = "null", value = "Pondělí [persistentní položka]")
  public Boolean getMonday() {
    return monday;
  }

  public void setMonday(Boolean monday) {
    this.monday = monday;
  }

  public Actionpricelist tuesday(Boolean tuesday) {
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Úterý [persistentní položka]
   * @return tuesday
  **/
  @ApiModelProperty(example = "null", value = "Úterý [persistentní položka]")
  public Boolean getTuesday() {
    return tuesday;
  }

  public void setTuesday(Boolean tuesday) {
    this.tuesday = tuesday;
  }

  public Actionpricelist wednesday(Boolean wednesday) {
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Středa [persistentní položka]
   * @return wednesday
  **/
  @ApiModelProperty(example = "null", value = "Středa [persistentní položka]")
  public Boolean getWednesday() {
    return wednesday;
  }

  public void setWednesday(Boolean wednesday) {
    this.wednesday = wednesday;
  }

  public Actionpricelist thursday(Boolean thursday) {
    this.thursday = thursday;
    return this;
  }

   /**
   * Čtvrtek [persistentní položka]
   * @return thursday
  **/
  @ApiModelProperty(example = "null", value = "Čtvrtek [persistentní položka]")
  public Boolean getThursday() {
    return thursday;
  }

  public void setThursday(Boolean thursday) {
    this.thursday = thursday;
  }

  public Actionpricelist friday(Boolean friday) {
    this.friday = friday;
    return this;
  }

   /**
   * Pátek [persistentní položka]
   * @return friday
  **/
  @ApiModelProperty(example = "null", value = "Pátek [persistentní položka]")
  public Boolean getFriday() {
    return friday;
  }

  public void setFriday(Boolean friday) {
    this.friday = friday;
  }

  public Actionpricelist saturday(Boolean saturday) {
    this.saturday = saturday;
    return this;
  }

   /**
   * Sobota [persistentní položka]
   * @return saturday
  **/
  @ApiModelProperty(example = "null", value = "Sobota [persistentní položka]")
  public Boolean getSaturday() {
    return saturday;
  }

  public void setSaturday(Boolean saturday) {
    this.saturday = saturday;
  }

  public Actionpricelist sunday(Boolean sunday) {
    this.sunday = sunday;
    return this;
  }

   /**
   * Neděle [persistentní položka]
   * @return sunday
  **/
  @ApiModelProperty(example = "null", value = "Neděle [persistentní položka]")
  public Boolean getSunday() {
    return sunday;
  }

  public void setSunday(Boolean sunday) {
    this.sunday = sunday;
  }

  public Actionpricelist priceListRoundings(List<Actionpricelistrounding> priceListRoundings) {
    this.priceListRoundings = priceListRoundings;
    return this;
  }

  public Actionpricelist addPriceListRoundingsItem(Actionpricelistrounding priceListRoundingsItem) {
    this.priceListRoundings.add(priceListRoundingsItem);
    return this;
  }

   /**
   * Zaokrouhlování ceníku; kolekce BO Zaokrouhlování ceníku [nepersistentní položka]
   * @return priceListRoundings
  **/
  @ApiModelProperty(example = "null", value = "Zaokrouhlování ceníku; kolekce BO Zaokrouhlování ceníku [nepersistentní položka]")
  public List<Actionpricelistrounding> getPriceListRoundings() {
    return priceListRoundings;
  }

  public void setPriceListRoundings(List<Actionpricelistrounding> priceListRoundings) {
    this.priceListRoundings = priceListRoundings;
  }

  public Actionpricelist restrictionUses(List<Actionpricelistrestrictionuse> restrictionUses) {
    this.restrictionUses = restrictionUses;
    return this;
  }

  public Actionpricelist addRestrictionUsesItem(Actionpricelistrestrictionuse restrictionUsesItem) {
    this.restrictionUses.add(restrictionUsesItem);
    return this;
  }

   /**
   * Omezení použití; kolekce BO ActionPriceListRestrictionUse [nepersistentní položka]
   * @return restrictionUses
  **/
  @ApiModelProperty(example = "null", value = "Omezení použití; kolekce BO ActionPriceListRestrictionUse [nepersistentní položka]")
  public List<Actionpricelistrestrictionuse> getRestrictionUses() {
    return restrictionUses;
  }

  public void setRestrictionUses(List<Actionpricelistrestrictionuse> restrictionUses) {
    this.restrictionUses = restrictionUses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actionpricelist actionpricelist = (Actionpricelist) o;
    return Objects.equals(this.displayName, actionpricelist.displayName) &&
        Objects.equals(this.ID, actionpricelist.ID) &&
        Objects.equals(this.classID, actionpricelist.classID) &&
        Objects.equals(this.objVersion, actionpricelist.objVersion) &&
        Objects.equals(this.hidden, actionpricelist.hidden) &&
        Objects.equals(this.code, actionpricelist.code) &&
        Objects.equals(this.name, actionpricelist.name) &&
        Objects.equals(this.note, actionpricelist.note) &&
        Objects.equals(this.comment, actionpricelist.comment) &&
        Objects.equals(this.managedByID, actionpricelist.managedByID) &&
        Objects.equals(this.creationDateDATE, actionpricelist.creationDateDATE) &&
        Objects.equals(this.dealerDiscountExcluded, actionpricelist.dealerDiscountExcluded) &&
        Objects.equals(this.individualDiscountExcluded, actionpricelist.individualDiscountExcluded) &&
        Objects.equals(this.financialDiscountExcluded, actionpricelist.financialDiscountExcluded) &&
        Objects.equals(this.quantityDiscountExcluded, actionpricelist.quantityDiscountExcluded) &&
        Objects.equals(this.documentDiscountExcluded, actionpricelist.documentDiscountExcluded) &&
        Objects.equals(this.priority, actionpricelist.priority) &&
        Objects.equals(this.dateFromDATE, actionpricelist.dateFromDATE) &&
        Objects.equals(this.dateToDATE, actionpricelist.dateToDATE) &&
        Objects.equals(this.byTime, actionpricelist.byTime) &&
        Objects.equals(this.timeFrom, actionpricelist.timeFrom) &&
        Objects.equals(this.timeTo, actionpricelist.timeTo) &&
        Objects.equals(this.byDateOfWeek, actionpricelist.byDateOfWeek) &&
        Objects.equals(this.monday, actionpricelist.monday) &&
        Objects.equals(this.tuesday, actionpricelist.tuesday) &&
        Objects.equals(this.wednesday, actionpricelist.wednesday) &&
        Objects.equals(this.thursday, actionpricelist.thursday) &&
        Objects.equals(this.friday, actionpricelist.friday) &&
        Objects.equals(this.saturday, actionpricelist.saturday) &&
        Objects.equals(this.sunday, actionpricelist.sunday) &&
        Objects.equals(this.priceListRoundings, actionpricelist.priceListRoundings) &&
        Objects.equals(this.restrictionUses, actionpricelist.restrictionUses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, hidden, code, name, note, comment, managedByID, creationDateDATE, dealerDiscountExcluded, individualDiscountExcluded, financialDiscountExcluded, quantityDiscountExcluded, documentDiscountExcluded, priority, dateFromDATE, dateToDATE, byTime, timeFrom, timeTo, byDateOfWeek, monday, tuesday, wednesday, thursday, friday, saturday, sunday, priceListRoundings, restrictionUses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actionpricelist {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    managedByID: ").append(toIndentedString(managedByID)).append("\n");
    sb.append("    creationDateDATE: ").append(toIndentedString(creationDateDATE)).append("\n");
    sb.append("    dealerDiscountExcluded: ").append(toIndentedString(dealerDiscountExcluded)).append("\n");
    sb.append("    individualDiscountExcluded: ").append(toIndentedString(individualDiscountExcluded)).append("\n");
    sb.append("    financialDiscountExcluded: ").append(toIndentedString(financialDiscountExcluded)).append("\n");
    sb.append("    quantityDiscountExcluded: ").append(toIndentedString(quantityDiscountExcluded)).append("\n");
    sb.append("    documentDiscountExcluded: ").append(toIndentedString(documentDiscountExcluded)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dateFromDATE: ").append(toIndentedString(dateFromDATE)).append("\n");
    sb.append("    dateToDATE: ").append(toIndentedString(dateToDATE)).append("\n");
    sb.append("    byTime: ").append(toIndentedString(byTime)).append("\n");
    sb.append("    timeFrom: ").append(toIndentedString(timeFrom)).append("\n");
    sb.append("    timeTo: ").append(toIndentedString(timeTo)).append("\n");
    sb.append("    byDateOfWeek: ").append(toIndentedString(byDateOfWeek)).append("\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
    sb.append("    priceListRoundings: ").append(toIndentedString(priceListRoundings)).append("\n");
    sb.append("    restrictionUses: ").append(toIndentedString(restrictionUses)).append("\n");
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

