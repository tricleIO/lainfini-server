/**
 * abra gen web api (spojení testapi)
 * webové api systému 17.03.03
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

import java.util.Objects;


/**
 * Plmfinishedproductrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Plmfinishedproductrow   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("jooutputitem_id")
  private String jooutputitemId = null;

  @SerializedName("joborderssn_id")
  private String joborderssnId = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("qunit")
  private String qunit = null;

  @SerializedName("unitrate")
  private Double unitrate = null;

  @SerializedName("receivedby_id")
  private String receivedbyId = null;

  @SerializedName("receivedat$date")
  private DateTime receivedatdate = null;

  @SerializedName("checkedby_id")
  private String checkedbyId = null;

  @SerializedName("checkedat$date")
  private DateTime checkedatdate = null;

  @SerializedName("unitquantity")
  private Double unitquantity = null;

  @SerializedName("storedoc2_id")
  private String storedoc2Id = null;

  @SerializedName("materialexpenseamount")
  private Double materialexpenseamount = null;

  @SerializedName("consumablesamount")
  private Double consumablesamount = null;

  @SerializedName("priceamount")
  private Double priceamount = null;

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("period_id")
  private String periodId = null;

  @SerializedName("ordnumber")
  private Integer ordnumber = null;

  @SerializedName("docdate$date")
  private DateTime docdatedate = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("accpresetdef_id")
  private String accpresetdefId = null;

  @SerializedName("accdate$date")
  private DateTime accdatedate = null;

  @SerializedName("productiondate$date")
  private DateTime productiondatedate = null;

  @SerializedName("cooperation")
  private Boolean cooperation = null;

  public Plmfinishedproductrow displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * název
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Plmfinishedproductrow id(String id) {
    this.id = id;
    return this;
  }

   /**
   * vlastní id [persistentní položka]
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "vlastní id [persistentní položka]")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Plmfinishedproductrow classid(String classid) {
    this.classid = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid() {
    return classid;
  }

  public void setClassid(String classid) {
    this.classid = classid;
  }

  public Plmfinishedproductrow objversion(Integer objversion) {
    this.objversion = objversion;
    return this;
  }

   /**
   * verze objektu [persistentní položka]
   * @return objversion
  **/
  @ApiModelProperty(example = "null", value = "verze objektu [persistentní položka]")
  public Integer getObjversion() {
    return objversion;
  }

  public void setObjversion(Integer objversion) {
    this.objversion = objversion;
  }

  public Plmfinishedproductrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * hlavička zaúčtování; id objektu dokončený výrobek [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "hlavička zaúčtování; id objektu dokončený výrobek [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Plmfinishedproductrow jooutputitemId(String jooutputitemId) {
    this.jooutputitemId = jooutputitemId;
    return this;
  }

   /**
   * vyráběná položka; id objektu vp - vyráběná položka [persistentní položka]
   * @return jooutputitemId
  **/
  @ApiModelProperty(example = "null", value = "vyráběná položka; id objektu vp - vyráběná položka [persistentní položka]")
  public String getJooutputitemId() {
    return jooutputitemId;
  }

  public void setJooutputitemId(String jooutputitemId) {
    this.jooutputitemId = jooutputitemId;
  }

  public Plmfinishedproductrow joborderssnId(String joborderssnId) {
    this.joborderssnId = joborderssnId;
    return this;
  }

   /**
   * sériové číslo/šarže; id objektu vp - sériové číslo [persistentní položka]
   * @return joborderssnId
  **/
  @ApiModelProperty(example = "null", value = "sériové číslo/šarže; id objektu vp - sériové číslo [persistentní položka]")
  public String getJoborderssnId() {
    return joborderssnId;
  }

  public void setJoborderssnId(String joborderssnId) {
    this.joborderssnId = joborderssnId;
  }

  public Plmfinishedproductrow quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * množství v ev.jedn. [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "množství v ev.jedn. [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Plmfinishedproductrow qunit(String qunit) {
    this.qunit = qunit;
    return this;
  }

   /**
   * jednotka [persistentní položka]
   * @return qunit
  **/
  @ApiModelProperty(example = "null", value = "jednotka [persistentní položka]")
  public String getQunit() {
    return qunit;
  }

  public void setQunit(String qunit) {
    this.qunit = qunit;
  }

  public Plmfinishedproductrow unitrate(Double unitrate) {
    this.unitrate = unitrate;
    return this;
  }

   /**
   * vztah [persistentní položka]
   * @return unitrate
  **/
  @ApiModelProperty(example = "null", value = "vztah [persistentní položka]")
  public Double getUnitrate() {
    return unitrate;
  }

  public void setUnitrate(Double unitrate) {
    this.unitrate = unitrate;
  }

  public Plmfinishedproductrow receivedbyId(String receivedbyId) {
    this.receivedbyId = receivedbyId;
    return this;
  }

   /**
   * přijal; id objektu uživatel [persistentní položka]
   * @return receivedbyId
  **/
  @ApiModelProperty(example = "null", value = "přijal; id objektu uživatel [persistentní položka]")
  public String getReceivedbyId() {
    return receivedbyId;
  }

  public void setReceivedbyId(String receivedbyId) {
    this.receivedbyId = receivedbyId;
  }

  public Plmfinishedproductrow receivedatdate(DateTime receivedatdate) {
    this.receivedatdate = receivedatdate;
    return this;
  }

   /**
   * datum přijetí [persistentní položka]
   * @return receivedatdate
  **/
  @ApiModelProperty(example = "null", value = "datum přijetí [persistentní položka]")
  public DateTime getReceivedatdate() {
    return receivedatdate;
  }

  public void setReceivedatdate(DateTime receivedatdate) {
    this.receivedatdate = receivedatdate;
  }

  public Plmfinishedproductrow checkedbyId(String checkedbyId) {
    this.checkedbyId = checkedbyId;
    return this;
  }

   /**
   * zkontroloval; id objektu uživatel [persistentní položka]
   * @return checkedbyId
  **/
  @ApiModelProperty(example = "null", value = "zkontroloval; id objektu uživatel [persistentní položka]")
  public String getCheckedbyId() {
    return checkedbyId;
  }

  public void setCheckedbyId(String checkedbyId) {
    this.checkedbyId = checkedbyId;
  }

  public Plmfinishedproductrow checkedatdate(DateTime checkedatdate) {
    this.checkedatdate = checkedatdate;
    return this;
  }

   /**
   * datum kontroly [persistentní položka]
   * @return checkedatdate
  **/
  @ApiModelProperty(example = "null", value = "datum kontroly [persistentní položka]")
  public DateTime getCheckedatdate() {
    return checkedatdate;
  }

  public void setCheckedatdate(DateTime checkedatdate) {
    this.checkedatdate = checkedatdate;
  }

  public Plmfinishedproductrow unitquantity(Double unitquantity) {
    this.unitquantity = unitquantity;
    return this;
  }

   /**
   * množství
   * @return unitquantity
  **/
  @ApiModelProperty(example = "null", value = "množství")
  public Double getUnitquantity() {
    return unitquantity;
  }

  public void setUnitquantity(Double unitquantity) {
    this.unitquantity = unitquantity;
  }

  public Plmfinishedproductrow storedoc2Id(String storedoc2Id) {
    this.storedoc2Id = storedoc2Id;
    return this;
  }

   /**
   * Řádek příjemky; id objektu příjem hotových výrobků - řádek [persistentní položka]
   * @return storedoc2Id
  **/
  @ApiModelProperty(example = "null", value = "Řádek příjemky; id objektu příjem hotových výrobků - řádek [persistentní položka]")
  public String getStoredoc2Id() {
    return storedoc2Id;
  }

  public void setStoredoc2Id(String storedoc2Id) {
    this.storedoc2Id = storedoc2Id;
  }

  public Plmfinishedproductrow materialexpenseamount(Double materialexpenseamount) {
    this.materialexpenseamount = materialexpenseamount;
    return this;
  }

   /**
   * materiálová režie [persistentní položka]
   * @return materialexpenseamount
  **/
  @ApiModelProperty(example = "null", value = "materiálová režie [persistentní položka]")
  public Double getMaterialexpenseamount() {
    return materialexpenseamount;
  }

  public void setMaterialexpenseamount(Double materialexpenseamount) {
    this.materialexpenseamount = materialexpenseamount;
  }

  public Plmfinishedproductrow consumablesamount(Double consumablesamount) {
    this.consumablesamount = consumablesamount;
    return this;
  }

   /**
   * spotřební materiál [persistentní položka]
   * @return consumablesamount
  **/
  @ApiModelProperty(example = "null", value = "spotřební materiál [persistentní položka]")
  public Double getConsumablesamount() {
    return consumablesamount;
  }

  public void setConsumablesamount(Double consumablesamount) {
    this.consumablesamount = consumablesamount;
  }

  public Plmfinishedproductrow priceamount(Double priceamount) {
    this.priceamount = priceamount;
    return this;
  }

   /**
   * pevná cena [persistentní položka]
   * @return priceamount
  **/
  @ApiModelProperty(example = "null", value = "pevná cena [persistentní položka]")
  public Double getPriceamount() {
    return priceamount;
  }

  public void setPriceamount(Double priceamount) {
    this.priceamount = priceamount;
  }

  public Plmfinishedproductrow docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * Řada; id objektu Řada dokladů
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "Řada; id objektu Řada dokladů")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Plmfinishedproductrow periodId(String periodId) {
    this.periodId = periodId;
    return this;
  }

   /**
   * období; id objektu období
   * @return periodId
  **/
  @ApiModelProperty(example = "null", value = "období; id objektu období")
  public String getPeriodId() {
    return periodId;
  }

  public void setPeriodId(String periodId) {
    this.periodId = periodId;
  }

  public Plmfinishedproductrow ordnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
    return this;
  }

   /**
   * pořadové číslo
   * @return ordnumber
  **/
  @ApiModelProperty(example = "null", value = "pořadové číslo")
  public Integer getOrdnumber() {
    return ordnumber;
  }

  public void setOrdnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
  }

  public Plmfinishedproductrow docdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
    return this;
  }

   /**
   * datum dok.
   * @return docdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum dok.")
  public DateTime getDocdatedate() {
    return docdatedate;
  }

  public void setDocdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
  }

  public Plmfinishedproductrow createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * vytvořil; id objektu uživatel
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "vytvořil; id objektu uživatel")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Plmfinishedproductrow correctedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
    return this;
  }

   /**
   * opravil; id objektu uživatel
   * @return correctedbyId
  **/
  @ApiModelProperty(example = "null", value = "opravil; id objektu uživatel")
  public String getCorrectedbyId() {
    return correctedbyId;
  }

  public void setCorrectedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
  }

  public Plmfinishedproductrow accpresetdefId(String accpresetdefId) {
    this.accpresetdefId = accpresetdefId;
    return this;
  }

   /**
   * předkontace; id objektu Účetní předkontace
   * @return accpresetdefId
  **/
  @ApiModelProperty(example = "null", value = "předkontace; id objektu Účetní předkontace")
  public String getAccpresetdefId() {
    return accpresetdefId;
  }

  public void setAccpresetdefId(String accpresetdefId) {
    this.accpresetdefId = accpresetdefId;
  }

  public Plmfinishedproductrow accdatedate(DateTime accdatedate) {
    this.accdatedate = accdatedate;
    return this;
  }

   /**
   * datum účt.
   * @return accdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum účt.")
  public DateTime getAccdatedate() {
    return accdatedate;
  }

  public void setAccdatedate(DateTime accdatedate) {
    this.accdatedate = accdatedate;
  }

  public Plmfinishedproductrow productiondatedate(DateTime productiondatedate) {
    this.productiondatedate = productiondatedate;
    return this;
  }

   /**
   * datum výroby [persistentní položka]
   * @return productiondatedate
  **/
  @ApiModelProperty(example = "null", value = "datum výroby [persistentní položka]")
  public DateTime getProductiondatedate() {
    return productiondatedate;
  }

  public void setProductiondatedate(DateTime productiondatedate) {
    this.productiondatedate = productiondatedate;
  }

  public Plmfinishedproductrow cooperation(Boolean cooperation) {
    this.cooperation = cooperation;
    return this;
  }

   /**
   * kooperace [persistentní položka]
   * @return cooperation
  **/
  @ApiModelProperty(example = "null", value = "kooperace [persistentní položka]")
  public Boolean getCooperation() {
    return cooperation;
  }

  public void setCooperation(Boolean cooperation) {
    this.cooperation = cooperation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmfinishedproductrow plmfinishedproductrow = (Plmfinishedproductrow) o;
    return Objects.equals(this.displayname, plmfinishedproductrow.displayname) &&
        Objects.equals(this.id, plmfinishedproductrow.id) &&
        Objects.equals(this.classid, plmfinishedproductrow.classid) &&
        Objects.equals(this.objversion, plmfinishedproductrow.objversion) &&
        Objects.equals(this.parentId, plmfinishedproductrow.parentId) &&
        Objects.equals(this.jooutputitemId, plmfinishedproductrow.jooutputitemId) &&
        Objects.equals(this.joborderssnId, plmfinishedproductrow.joborderssnId) &&
        Objects.equals(this.quantity, plmfinishedproductrow.quantity) &&
        Objects.equals(this.qunit, plmfinishedproductrow.qunit) &&
        Objects.equals(this.unitrate, plmfinishedproductrow.unitrate) &&
        Objects.equals(this.receivedbyId, plmfinishedproductrow.receivedbyId) &&
        Objects.equals(this.receivedatdate, plmfinishedproductrow.receivedatdate) &&
        Objects.equals(this.checkedbyId, plmfinishedproductrow.checkedbyId) &&
        Objects.equals(this.checkedatdate, plmfinishedproductrow.checkedatdate) &&
        Objects.equals(this.unitquantity, plmfinishedproductrow.unitquantity) &&
        Objects.equals(this.storedoc2Id, plmfinishedproductrow.storedoc2Id) &&
        Objects.equals(this.materialexpenseamount, plmfinishedproductrow.materialexpenseamount) &&
        Objects.equals(this.consumablesamount, plmfinishedproductrow.consumablesamount) &&
        Objects.equals(this.priceamount, plmfinishedproductrow.priceamount) &&
        Objects.equals(this.docqueueId, plmfinishedproductrow.docqueueId) &&
        Objects.equals(this.periodId, plmfinishedproductrow.periodId) &&
        Objects.equals(this.ordnumber, plmfinishedproductrow.ordnumber) &&
        Objects.equals(this.docdatedate, plmfinishedproductrow.docdatedate) &&
        Objects.equals(this.createdbyId, plmfinishedproductrow.createdbyId) &&
        Objects.equals(this.correctedbyId, plmfinishedproductrow.correctedbyId) &&
        Objects.equals(this.accpresetdefId, plmfinishedproductrow.accpresetdefId) &&
        Objects.equals(this.accdatedate, plmfinishedproductrow.accdatedate) &&
        Objects.equals(this.productiondatedate, plmfinishedproductrow.productiondatedate) &&
        Objects.equals(this.cooperation, plmfinishedproductrow.cooperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, jooutputitemId, joborderssnId, quantity, qunit, unitrate, receivedbyId, receivedatdate, checkedbyId, checkedatdate, unitquantity, storedoc2Id, materialexpenseamount, consumablesamount, priceamount, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, accpresetdefId, accdatedate, productiondatedate, cooperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmfinishedproductrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    jooutputitemId: ").append(toIndentedString(jooutputitemId)).append("\n");
    sb.append("    joborderssnId: ").append(toIndentedString(joborderssnId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    qunit: ").append(toIndentedString(qunit)).append("\n");
    sb.append("    unitrate: ").append(toIndentedString(unitrate)).append("\n");
    sb.append("    receivedbyId: ").append(toIndentedString(receivedbyId)).append("\n");
    sb.append("    receivedatdate: ").append(toIndentedString(receivedatdate)).append("\n");
    sb.append("    checkedbyId: ").append(toIndentedString(checkedbyId)).append("\n");
    sb.append("    checkedatdate: ").append(toIndentedString(checkedatdate)).append("\n");
    sb.append("    unitquantity: ").append(toIndentedString(unitquantity)).append("\n");
    sb.append("    storedoc2Id: ").append(toIndentedString(storedoc2Id)).append("\n");
    sb.append("    materialexpenseamount: ").append(toIndentedString(materialexpenseamount)).append("\n");
    sb.append("    consumablesamount: ").append(toIndentedString(consumablesamount)).append("\n");
    sb.append("    priceamount: ").append(toIndentedString(priceamount)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    ordnumber: ").append(toIndentedString(ordnumber)).append("\n");
    sb.append("    docdatedate: ").append(toIndentedString(docdatedate)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    accpresetdefId: ").append(toIndentedString(accpresetdefId)).append("\n");
    sb.append("    accdatedate: ").append(toIndentedString(accdatedate)).append("\n");
    sb.append("    productiondatedate: ").append(toIndentedString(productiondatedate)).append("\n");
    sb.append("    cooperation: ").append(toIndentedString(cooperation)).append("\n");
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

