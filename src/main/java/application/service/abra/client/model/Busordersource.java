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

import java.util.Objects;


/**
 * Busordersource
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Busordersource   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("PosIndex")
  private Integer posIndex = null;

  @SerializedName("SourceRole_ID")
  private String sourceRoleID = null;

  @SerializedName("SourceOrder")
  private Integer sourceOrder = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("CRMActivityArea_ID")
  private String cRMActivityAreaID = null;

  @SerializedName("CRMActivityType_ID")
  private String cRMActivityTypeID = null;

  @SerializedName("CRMActivityQueue_ID")
  private String cRMActivityQueueID = null;

  @SerializedName("PlannedTotalHours")
  private Double plannedTotalHours = null;

  @SerializedName("RealTotalHours")
  private Double realTotalHours = null;

  @SerializedName("CanExceedPlan")
  private Integer canExceedPlan = null;

  @SerializedName("Invoicing")
  private Boolean invoicing = null;

  @SerializedName("SalePriceType")
  private Integer salePriceType = null;

  @SerializedName("HourRate")
  private Double hourRate = null;

  @SerializedName("OverTimeHourRate")
  private Double overTimeHourRate = null;

  @SerializedName("VATRate_ID")
  private String vATRateID = null;

  @SerializedName("CostHourRate")
  private Double costHourRate = null;

  @SerializedName("StoreCard_ID")
  private String storeCardID = null;

  @SerializedName("StoreUnit_ID")
  private String storeUnitID = null;

  @SerializedName("Store_ID")
  private String storeID = null;

  @SerializedName("PriceDefinition1_ID")
  private String priceDefinition1ID = null;

  @SerializedName("PriceDefinition2_ID")
  private String priceDefinition2ID = null;

  @SerializedName("Finished")
  private Boolean finished = null;

  @SerializedName("Note")
  private String note = null;

  @SerializedName("Division_ID")
  private String divisionID = null;

  @SerializedName("BusTransaction_ID")
  private String busTransactionID = null;

  @SerializedName("BusProject_ID")
  private String busProjectID = null;

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

   /**
   * Vlastník; ID objektu Zakázka [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Zakázka [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Busordersource posIndex(Integer posIndex) {
    this.posIndex = posIndex;
    return this;
  }

   /**
   * Pořadí [persistentní položka]
   * @return posIndex
  **/
  @ApiModelProperty(example = "null", value = "Pořadí [persistentní položka]")
  public Integer getPosIndex() {
    return posIndex;
  }

  public void setPosIndex(Integer posIndex) {
    this.posIndex = posIndex;
  }

  public Busordersource sourceRoleID(String sourceRoleID) {
    this.sourceRoleID = sourceRoleID;
    return this;
  }

   /**
   * Role zdroje; ID objektu Role [persistentní položka]
   * @return sourceRoleID
  **/
  @ApiModelProperty(example = "null", value = "Role zdroje; ID objektu Role [persistentní položka]")
  public String getSourceRoleID() {
    return sourceRoleID;
  }

  public void setSourceRoleID(String sourceRoleID) {
    this.sourceRoleID = sourceRoleID;
  }

  public Busordersource sourceOrder(Integer sourceOrder) {
    this.sourceOrder = sourceOrder;
    return this;
  }

   /**
   * Pořadí [persistentní položka]
   * @return sourceOrder
  **/
  @ApiModelProperty(example = "null", value = "Pořadí [persistentní položka]")
  public Integer getSourceOrder() {
    return sourceOrder;
  }

  public void setSourceOrder(Integer sourceOrder) {
    this.sourceOrder = sourceOrder;
  }

  public Busordersource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Busordersource cRMActivityAreaID(String cRMActivityAreaID) {
    this.cRMActivityAreaID = cRMActivityAreaID;
    return this;
  }

   /**
   * Oblast aktivity; ID objektu Oblast aktivity [persistentní položka]
   * @return cRMActivityAreaID
  **/
  @ApiModelProperty(example = "null", value = "Oblast aktivity; ID objektu Oblast aktivity [persistentní položka]")
  public String getCRMActivityAreaID() {
    return cRMActivityAreaID;
  }

  public void setCRMActivityAreaID(String cRMActivityAreaID) {
    this.cRMActivityAreaID = cRMActivityAreaID;
  }

  public Busordersource cRMActivityTypeID(String cRMActivityTypeID) {
    this.cRMActivityTypeID = cRMActivityTypeID;
    return this;
  }

   /**
   * Typ aktivity; ID objektu Typ aktivit [persistentní položka]
   * @return cRMActivityTypeID
  **/
  @ApiModelProperty(example = "null", value = "Typ aktivity; ID objektu Typ aktivit [persistentní položka]")
  public String getCRMActivityTypeID() {
    return cRMActivityTypeID;
  }

  public void setCRMActivityTypeID(String cRMActivityTypeID) {
    this.cRMActivityTypeID = cRMActivityTypeID;
  }

  public Busordersource cRMActivityQueueID(String cRMActivityQueueID) {
    this.cRMActivityQueueID = cRMActivityQueueID;
    return this;
  }

   /**
   * Řada akt.; ID objektu Řada aktivit [persistentní položka]
   * @return cRMActivityQueueID
  **/
  @ApiModelProperty(example = "null", value = "Řada akt.; ID objektu Řada aktivit [persistentní položka]")
  public String getCRMActivityQueueID() {
    return cRMActivityQueueID;
  }

  public void setCRMActivityQueueID(String cRMActivityQueueID) {
    this.cRMActivityQueueID = cRMActivityQueueID;
  }

  public Busordersource plannedTotalHours(Double plannedTotalHours) {
    this.plannedTotalHours = plannedTotalHours;
    return this;
  }

   /**
   * Plánováno [persistentní položka]
   * @return plannedTotalHours
  **/
  @ApiModelProperty(example = "null", value = "Plánováno [persistentní položka]")
  public Double getPlannedTotalHours() {
    return plannedTotalHours;
  }

  public void setPlannedTotalHours(Double plannedTotalHours) {
    this.plannedTotalHours = plannedTotalHours;
  }

  public Busordersource realTotalHours(Double realTotalHours) {
    this.realTotalHours = realTotalHours;
    return this;
  }

   /**
   * Odpracováno [persistentní položka]
   * @return realTotalHours
  **/
  @ApiModelProperty(example = "null", value = "Odpracováno [persistentní položka]")
  public Double getRealTotalHours() {
    return realTotalHours;
  }

  public void setRealTotalHours(Double realTotalHours) {
    this.realTotalHours = realTotalHours;
  }

  public Busordersource canExceedPlan(Integer canExceedPlan) {
    this.canExceedPlan = canExceedPlan;
    return this;
  }

   /**
   * Povol.přesčas [persistentní položka]
   * @return canExceedPlan
  **/
  @ApiModelProperty(example = "null", value = "Povol.přesčas [persistentní položka]")
  public Integer getCanExceedPlan() {
    return canExceedPlan;
  }

  public void setCanExceedPlan(Integer canExceedPlan) {
    this.canExceedPlan = canExceedPlan;
  }

  public Busordersource invoicing(Boolean invoicing) {
    this.invoicing = invoicing;
    return this;
  }

   /**
   * Fakturovat [persistentní položka]
   * @return invoicing
  **/
  @ApiModelProperty(example = "null", value = "Fakturovat [persistentní položka]")
  public Boolean getInvoicing() {
    return invoicing;
  }

  public void setInvoicing(Boolean invoicing) {
    this.invoicing = invoicing;
  }

  public Busordersource salePriceType(Integer salePriceType) {
    this.salePriceType = salePriceType;
    return this;
  }

   /**
   * Typ ceny [persistentní položka]
   * @return salePriceType
  **/
  @ApiModelProperty(example = "null", value = "Typ ceny [persistentní položka]")
  public Integer getSalePriceType() {
    return salePriceType;
  }

  public void setSalePriceType(Integer salePriceType) {
    this.salePriceType = salePriceType;
  }

  public Busordersource hourRate(Double hourRate) {
    this.hourRate = hourRate;
    return this;
  }

   /**
   * Zákl.sazba [persistentní položka]
   * @return hourRate
  **/
  @ApiModelProperty(example = "null", value = "Zákl.sazba [persistentní položka]")
  public Double getHourRate() {
    return hourRate;
  }

  public void setHourRate(Double hourRate) {
    this.hourRate = hourRate;
  }

  public Busordersource overTimeHourRate(Double overTimeHourRate) {
    this.overTimeHourRate = overTimeHourRate;
    return this;
  }

   /**
   * Přesčas.sazba [persistentní položka]
   * @return overTimeHourRate
  **/
  @ApiModelProperty(example = "null", value = "Přesčas.sazba [persistentní položka]")
  public Double getOverTimeHourRate() {
    return overTimeHourRate;
  }

  public void setOverTimeHourRate(Double overTimeHourRate) {
    this.overTimeHourRate = overTimeHourRate;
  }

  public Busordersource vATRateID(String vATRateID) {
    this.vATRateID = vATRateID;
    return this;
  }

   /**
   * Sazba DPH; ID objektu DPH sazba [persistentní položka]
   * @return vATRateID
  **/
  @ApiModelProperty(example = "null", value = "Sazba DPH; ID objektu DPH sazba [persistentní položka]")
  public String getVATRateID() {
    return vATRateID;
  }

  public void setVATRateID(String vATRateID) {
    this.vATRateID = vATRateID;
  }

  public Busordersource costHourRate(Double costHourRate) {
    this.costHourRate = costHourRate;
    return this;
  }

   /**
   * Náklad.sazba [persistentní položka]
   * @return costHourRate
  **/
  @ApiModelProperty(example = "null", value = "Náklad.sazba [persistentní položka]")
  public Double getCostHourRate() {
    return costHourRate;
  }

  public void setCostHourRate(Double costHourRate) {
    this.costHourRate = costHourRate;
  }

  public Busordersource storeCardID(String storeCardID) {
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

  public Busordersource storeUnitID(String storeUnitID) {
    this.storeUnitID = storeUnitID;
    return this;
  }

   /**
   * Jednotka; ID objektu Jednotka skladové karty [persistentní položka]
   * @return storeUnitID
  **/
  @ApiModelProperty(example = "null", value = "Jednotka; ID objektu Jednotka skladové karty [persistentní položka]")
  public String getStoreUnitID() {
    return storeUnitID;
  }

  public void setStoreUnitID(String storeUnitID) {
    this.storeUnitID = storeUnitID;
  }

  public Busordersource storeID(String storeID) {
    this.storeID = storeID;
    return this;
  }

   /**
   * Sklad; ID objektu Sklad [persistentní položka]
   * @return storeID
  **/
  @ApiModelProperty(example = "null", value = "Sklad; ID objektu Sklad [persistentní položka]")
  public String getStoreID() {
    return storeID;
  }

  public void setStoreID(String storeID) {
    this.storeID = storeID;
  }

  public Busordersource priceDefinition1ID(String priceDefinition1ID) {
    this.priceDefinition1ID = priceDefinition1ID;
    return this;
  }

   /**
   * Def.ceny zákl.; ID objektu Definice ceny [persistentní položka]
   * @return priceDefinition1ID
  **/
  @ApiModelProperty(example = "null", value = "Def.ceny zákl.; ID objektu Definice ceny [persistentní položka]")
  public String getPriceDefinition1ID() {
    return priceDefinition1ID;
  }

  public void setPriceDefinition1ID(String priceDefinition1ID) {
    this.priceDefinition1ID = priceDefinition1ID;
  }

  public Busordersource priceDefinition2ID(String priceDefinition2ID) {
    this.priceDefinition2ID = priceDefinition2ID;
    return this;
  }

   /**
   * Def.ceny přesč.; ID objektu Definice ceny [persistentní položka]
   * @return priceDefinition2ID
  **/
  @ApiModelProperty(example = "null", value = "Def.ceny přesč.; ID objektu Definice ceny [persistentní položka]")
  public String getPriceDefinition2ID() {
    return priceDefinition2ID;
  }

  public void setPriceDefinition2ID(String priceDefinition2ID) {
    this.priceDefinition2ID = priceDefinition2ID;
  }

  public Busordersource finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

   /**
   * Dokončeno [persistentní položka]
   * @return finished
  **/
  @ApiModelProperty(example = "null", value = "Dokončeno [persistentní položka]")
  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public Busordersource note(String note) {
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

  public Busordersource divisionID(String divisionID) {
    this.divisionID = divisionID;
    return this;
  }

   /**
   * Středisko; ID objektu Středisko [persistentní položka]
   * @return divisionID
  **/
  @ApiModelProperty(example = "null", value = "Středisko; ID objektu Středisko [persistentní položka]")
  public String getDivisionID() {
    return divisionID;
  }

  public void setDivisionID(String divisionID) {
    this.divisionID = divisionID;
  }

  public Busordersource busTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
    return this;
  }

   /**
   * obchodní případ; ID objektu Obchodní případ [persistentní položka]
   * @return busTransactionID
  **/
  @ApiModelProperty(example = "null", value = "obchodní případ; ID objektu Obchodní případ [persistentní položka]")
  public String getBusTransactionID() {
    return busTransactionID;
  }

  public void setBusTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
  }

  public Busordersource busProjectID(String busProjectID) {
    this.busProjectID = busProjectID;
    return this;
  }

   /**
   * projekt; ID objektu Projekt [persistentní položka]
   * @return busProjectID
  **/
  @ApiModelProperty(example = "null", value = "projekt; ID objektu Projekt [persistentní položka]")
  public String getBusProjectID() {
    return busProjectID;
  }

  public void setBusProjectID(String busProjectID) {
    this.busProjectID = busProjectID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Busordersource busordersource = (Busordersource) o;
    return Objects.equals(this.displayName, busordersource.displayName) &&
        Objects.equals(this.ID, busordersource.ID) &&
        Objects.equals(this.classID, busordersource.classID) &&
        Objects.equals(this.objVersion, busordersource.objVersion) &&
        Objects.equals(this.parentID, busordersource.parentID) &&
        Objects.equals(this.posIndex, busordersource.posIndex) &&
        Objects.equals(this.sourceRoleID, busordersource.sourceRoleID) &&
        Objects.equals(this.sourceOrder, busordersource.sourceOrder) &&
        Objects.equals(this.description, busordersource.description) &&
        Objects.equals(this.cRMActivityAreaID, busordersource.cRMActivityAreaID) &&
        Objects.equals(this.cRMActivityTypeID, busordersource.cRMActivityTypeID) &&
        Objects.equals(this.cRMActivityQueueID, busordersource.cRMActivityQueueID) &&
        Objects.equals(this.plannedTotalHours, busordersource.plannedTotalHours) &&
        Objects.equals(this.realTotalHours, busordersource.realTotalHours) &&
        Objects.equals(this.canExceedPlan, busordersource.canExceedPlan) &&
        Objects.equals(this.invoicing, busordersource.invoicing) &&
        Objects.equals(this.salePriceType, busordersource.salePriceType) &&
        Objects.equals(this.hourRate, busordersource.hourRate) &&
        Objects.equals(this.overTimeHourRate, busordersource.overTimeHourRate) &&
        Objects.equals(this.vATRateID, busordersource.vATRateID) &&
        Objects.equals(this.costHourRate, busordersource.costHourRate) &&
        Objects.equals(this.storeCardID, busordersource.storeCardID) &&
        Objects.equals(this.storeUnitID, busordersource.storeUnitID) &&
        Objects.equals(this.storeID, busordersource.storeID) &&
        Objects.equals(this.priceDefinition1ID, busordersource.priceDefinition1ID) &&
        Objects.equals(this.priceDefinition2ID, busordersource.priceDefinition2ID) &&
        Objects.equals(this.finished, busordersource.finished) &&
        Objects.equals(this.note, busordersource.note) &&
        Objects.equals(this.divisionID, busordersource.divisionID) &&
        Objects.equals(this.busTransactionID, busordersource.busTransactionID) &&
        Objects.equals(this.busProjectID, busordersource.busProjectID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, sourceRoleID, sourceOrder, description, cRMActivityAreaID, cRMActivityTypeID, cRMActivityQueueID, plannedTotalHours, realTotalHours, canExceedPlan, invoicing, salePriceType, hourRate, overTimeHourRate, vATRateID, costHourRate, storeCardID, storeUnitID, storeID, priceDefinition1ID, priceDefinition2ID, finished, note, divisionID, busTransactionID, busProjectID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Busordersource {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    sourceRoleID: ").append(toIndentedString(sourceRoleID)).append("\n");
    sb.append("    sourceOrder: ").append(toIndentedString(sourceOrder)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cRMActivityAreaID: ").append(toIndentedString(cRMActivityAreaID)).append("\n");
    sb.append("    cRMActivityTypeID: ").append(toIndentedString(cRMActivityTypeID)).append("\n");
    sb.append("    cRMActivityQueueID: ").append(toIndentedString(cRMActivityQueueID)).append("\n");
    sb.append("    plannedTotalHours: ").append(toIndentedString(plannedTotalHours)).append("\n");
    sb.append("    realTotalHours: ").append(toIndentedString(realTotalHours)).append("\n");
    sb.append("    canExceedPlan: ").append(toIndentedString(canExceedPlan)).append("\n");
    sb.append("    invoicing: ").append(toIndentedString(invoicing)).append("\n");
    sb.append("    salePriceType: ").append(toIndentedString(salePriceType)).append("\n");
    sb.append("    hourRate: ").append(toIndentedString(hourRate)).append("\n");
    sb.append("    overTimeHourRate: ").append(toIndentedString(overTimeHourRate)).append("\n");
    sb.append("    vATRateID: ").append(toIndentedString(vATRateID)).append("\n");
    sb.append("    costHourRate: ").append(toIndentedString(costHourRate)).append("\n");
    sb.append("    storeCardID: ").append(toIndentedString(storeCardID)).append("\n");
    sb.append("    storeUnitID: ").append(toIndentedString(storeUnitID)).append("\n");
    sb.append("    storeID: ").append(toIndentedString(storeID)).append("\n");
    sb.append("    priceDefinition1ID: ").append(toIndentedString(priceDefinition1ID)).append("\n");
    sb.append("    priceDefinition2ID: ").append(toIndentedString(priceDefinition2ID)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    divisionID: ").append(toIndentedString(divisionID)).append("\n");
    sb.append("    busTransactionID: ").append(toIndentedString(busTransactionID)).append("\n");
    sb.append("    busProjectID: ").append(toIndentedString(busProjectID)).append("\n");
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

