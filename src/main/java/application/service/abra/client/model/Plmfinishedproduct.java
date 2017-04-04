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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Plmfinishedproduct
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Plmfinishedproduct   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Plmfinishedproductrow> rows = new ArrayList<Plmfinishedproductrow>();

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

  @SerializedName("newrelatedtype")
  private Integer newrelatedtype = null;

  @SerializedName("newrelateddocument_id")
  private String newrelateddocumentId = null;

  @SerializedName("accpresetdef_id")
  private String accpresetdefId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("accdate$date")
  private DateTime accdatedate = null;

  @SerializedName("accdocqueue_id")
  private String accdocqueueId = null;

  @SerializedName("accountingtype")
  private Integer accountingtype = null;

  @SerializedName("isaccounted")
  private Boolean isaccounted = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("joborder_id")
  private String joborderId = null;

  @SerializedName("consumable")
  private Double consumable = null;

  @SerializedName("materialexpense")
  private Double materialexpense = null;

  @SerializedName("price")
  private Double price = null;

  public Plmfinishedproduct displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * Číslo dok.
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "Číslo dok.")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Plmfinishedproduct id(String id) {
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

  public Plmfinishedproduct classid(String classid) {
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

  public Plmfinishedproduct objversion(Integer objversion) {
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

  public Plmfinishedproduct rows(List<Plmfinishedproductrow> rows) {
    this.rows = rows;
    return this;
  }

  public Plmfinishedproduct addRowsItem(Plmfinishedproductrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo dokončený výrobek - řádek [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo dokončený výrobek - řádek [nepersistentní položka]")
  public List<Plmfinishedproductrow> getRows() {
    return rows;
  }

  public void setRows(List<Plmfinishedproductrow> rows) {
    this.rows = rows;
  }

  public Plmfinishedproduct docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * zdrojová řada; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "zdrojová řada; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Plmfinishedproduct periodId(String periodId) {
    this.periodId = periodId;
    return this;
  }

   /**
   * období; id objektu období [persistentní položka]
   * @return periodId
  **/
  @ApiModelProperty(example = "null", value = "období; id objektu období [persistentní položka]")
  public String getPeriodId() {
    return periodId;
  }

  public void setPeriodId(String periodId) {
    this.periodId = periodId;
  }

  public Plmfinishedproduct ordnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
    return this;
  }

   /**
   * pořadové číslo [persistentní položka]
   * @return ordnumber
  **/
  @ApiModelProperty(example = "null", value = "pořadové číslo [persistentní položka]")
  public Integer getOrdnumber() {
    return ordnumber;
  }

  public void setOrdnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
  }

  public Plmfinishedproduct docdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
    return this;
  }

   /**
   * datum dok. [persistentní položka]
   * @return docdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum dok. [persistentní položka]")
  public DateTime getDocdatedate() {
    return docdatedate;
  }

  public void setDocdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
  }

  public Plmfinishedproduct createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * vytvořil; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "vytvořil; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Plmfinishedproduct correctedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
    return this;
  }

   /**
   * opravil; id objektu uživatel [persistentní položka]
   * @return correctedbyId
  **/
  @ApiModelProperty(example = "null", value = "opravil; id objektu uživatel [persistentní položka]")
  public String getCorrectedbyId() {
    return correctedbyId;
  }

  public void setCorrectedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
  }

  public Plmfinishedproduct newrelatedtype(Integer newrelatedtype) {
    this.newrelatedtype = newrelatedtype;
    return this;
  }

   /**
   * typ relace
   * @return newrelatedtype
  **/
  @ApiModelProperty(example = "null", value = "typ relace")
  public Integer getNewrelatedtype() {
    return newrelatedtype;
  }

  public void setNewrelatedtype(Integer newrelatedtype) {
    this.newrelatedtype = newrelatedtype;
  }

  public Plmfinishedproduct newrelateddocumentId(String newrelateddocumentId) {
    this.newrelateddocumentId = newrelateddocumentId;
    return this;
  }

   /**
   * id dokladu pro připojení
   * @return newrelateddocumentId
  **/
  @ApiModelProperty(example = "null", value = "id dokladu pro připojení")
  public String getNewrelateddocumentId() {
    return newrelateddocumentId;
  }

  public void setNewrelateddocumentId(String newrelateddocumentId) {
    this.newrelateddocumentId = newrelateddocumentId;
  }

  public Plmfinishedproduct accpresetdefId(String accpresetdefId) {
    this.accpresetdefId = accpresetdefId;
    return this;
  }

   /**
   * předkontace; id objektu Účetní předkontace [persistentní položka]
   * @return accpresetdefId
  **/
  @ApiModelProperty(example = "null", value = "předkontace; id objektu Účetní předkontace [persistentní položka]")
  public String getAccpresetdefId() {
    return accpresetdefId;
  }

  public void setAccpresetdefId(String accpresetdefId) {
    this.accpresetdefId = accpresetdefId;
  }

  public Plmfinishedproduct description(String description) {
    this.description = description;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Plmfinishedproduct accdatedate(DateTime accdatedate) {
    this.accdatedate = accdatedate;
    return this;
  }

   /**
   * datum účt. [persistentní položka]
   * @return accdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum účt. [persistentní položka]")
  public DateTime getAccdatedate() {
    return accdatedate;
  }

  public void setAccdatedate(DateTime accdatedate) {
    this.accdatedate = accdatedate;
  }

  public Plmfinishedproduct accdocqueueId(String accdocqueueId) {
    this.accdocqueueId = accdocqueueId;
    return this;
  }

   /**
   * Účetní řada; id objektu Účetní řada dokladů [persistentní položka]
   * @return accdocqueueId
  **/
  @ApiModelProperty(example = "null", value = "Účetní řada; id objektu Účetní řada dokladů [persistentní položka]")
  public String getAccdocqueueId() {
    return accdocqueueId;
  }

  public void setAccdocqueueId(String accdocqueueId) {
    this.accdocqueueId = accdocqueueId;
  }

  public Plmfinishedproduct accountingtype(Integer accountingtype) {
    this.accountingtype = accountingtype;
    return this;
  }

   /**
   * jak účtovat
   * @return accountingtype
  **/
  @ApiModelProperty(example = "null", value = "jak účtovat")
  public Integer getAccountingtype() {
    return accountingtype;
  }

  public void setAccountingtype(Integer accountingtype) {
    this.accountingtype = accountingtype;
  }

  public Plmfinishedproduct isaccounted(Boolean isaccounted) {
    this.isaccounted = isaccounted;
    return this;
  }

   /**
   * Účtováno
   * @return isaccounted
  **/
  @ApiModelProperty(example = "null", value = "Účtováno")
  public Boolean getIsaccounted() {
    return isaccounted;
  }

  public void setIsaccounted(Boolean isaccounted) {
    this.isaccounted = isaccounted;
  }

  public Plmfinishedproduct amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Částka [persistentní položka]
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Částka [persistentní položka]")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Plmfinishedproduct joborderId(String joborderId) {
    this.joborderId = joborderId;
    return this;
  }

   /**
   * výrobní příkaz; id objektu výrobní příkaz [persistentní položka]
   * @return joborderId
  **/
  @ApiModelProperty(example = "null", value = "výrobní příkaz; id objektu výrobní příkaz [persistentní položka]")
  public String getJoborderId() {
    return joborderId;
  }

  public void setJoborderId(String joborderId) {
    this.joborderId = joborderId;
  }

  public Plmfinishedproduct consumable(Double consumable) {
    this.consumable = consumable;
    return this;
  }

   /**
   * spotřební mat.
   * @return consumable
  **/
  @ApiModelProperty(example = "null", value = "spotřební mat.")
  public Double getConsumable() {
    return consumable;
  }

  public void setConsumable(Double consumable) {
    this.consumable = consumable;
  }

  public Plmfinishedproduct materialexpense(Double materialexpense) {
    this.materialexpense = materialexpense;
    return this;
  }

   /**
   * materiálová režie
   * @return materialexpense
  **/
  @ApiModelProperty(example = "null", value = "materiálová režie")
  public Double getMaterialexpense() {
    return materialexpense;
  }

  public void setMaterialexpense(Double materialexpense) {
    this.materialexpense = materialexpense;
  }

  public Plmfinishedproduct price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * pevná cena
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "pevná cena")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmfinishedproduct plmfinishedproduct = (Plmfinishedproduct) o;
    return Objects.equals(this.displayname, plmfinishedproduct.displayname) &&
        Objects.equals(this.id, plmfinishedproduct.id) &&
        Objects.equals(this.classid, plmfinishedproduct.classid) &&
        Objects.equals(this.objversion, plmfinishedproduct.objversion) &&
        Objects.equals(this.rows, plmfinishedproduct.rows) &&
        Objects.equals(this.docqueueId, plmfinishedproduct.docqueueId) &&
        Objects.equals(this.periodId, plmfinishedproduct.periodId) &&
        Objects.equals(this.ordnumber, plmfinishedproduct.ordnumber) &&
        Objects.equals(this.docdatedate, plmfinishedproduct.docdatedate) &&
        Objects.equals(this.createdbyId, plmfinishedproduct.createdbyId) &&
        Objects.equals(this.correctedbyId, plmfinishedproduct.correctedbyId) &&
        Objects.equals(this.newrelatedtype, plmfinishedproduct.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, plmfinishedproduct.newrelateddocumentId) &&
        Objects.equals(this.accpresetdefId, plmfinishedproduct.accpresetdefId) &&
        Objects.equals(this.description, plmfinishedproduct.description) &&
        Objects.equals(this.accdatedate, plmfinishedproduct.accdatedate) &&
        Objects.equals(this.accdocqueueId, plmfinishedproduct.accdocqueueId) &&
        Objects.equals(this.accountingtype, plmfinishedproduct.accountingtype) &&
        Objects.equals(this.isaccounted, plmfinishedproduct.isaccounted) &&
        Objects.equals(this.amount, plmfinishedproduct.amount) &&
        Objects.equals(this.joborderId, plmfinishedproduct.joborderId) &&
        Objects.equals(this.consumable, plmfinishedproduct.consumable) &&
        Objects.equals(this.materialexpense, plmfinishedproduct.materialexpense) &&
        Objects.equals(this.price, plmfinishedproduct.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, accpresetdefId, description, accdatedate, accdocqueueId, accountingtype, isaccounted, amount, joborderId, consumable, materialexpense, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmfinishedproduct {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    ordnumber: ").append(toIndentedString(ordnumber)).append("\n");
    sb.append("    docdatedate: ").append(toIndentedString(docdatedate)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    newrelatedtype: ").append(toIndentedString(newrelatedtype)).append("\n");
    sb.append("    newrelateddocumentId: ").append(toIndentedString(newrelateddocumentId)).append("\n");
    sb.append("    accpresetdefId: ").append(toIndentedString(accpresetdefId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accdatedate: ").append(toIndentedString(accdatedate)).append("\n");
    sb.append("    accdocqueueId: ").append(toIndentedString(accdocqueueId)).append("\n");
    sb.append("    accountingtype: ").append(toIndentedString(accountingtype)).append("\n");
    sb.append("    isaccounted: ").append(toIndentedString(isaccounted)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    joborderId: ").append(toIndentedString(joborderId)).append("\n");
    sb.append("    consumable: ").append(toIndentedString(consumable)).append("\n");
    sb.append("    materialexpense: ").append(toIndentedString(materialexpense)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
