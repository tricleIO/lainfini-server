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
 * Cdconfirmapproved
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Cdconfirmapproved   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Cdconfirmapprovedrow> rows = new ArrayList<Cdconfirmapprovedrow>();

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

  @SerializedName("priceprecision")
  private Integer priceprecision = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("additionamount")
  private Double additionamount = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("description2")
  private String description2 = null;

  @SerializedName("validityfrom$date")
  private DateTime validityfromdate = null;

  @SerializedName("validityto$date")
  private DateTime validitytodate = null;

  @SerializedName("approval_id")
  private String approvalId = null;

  @SerializedName("currency_id")
  private String currencyId = null;

  @SerializedName("drawingamount")
  private Double drawingamount = null;

  public Cdconfirmapproved displayname(String displayname) {
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

  public Cdconfirmapproved id(String id) {
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

  public Cdconfirmapproved classid(String classid) {
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

  public Cdconfirmapproved objversion(Integer objversion) {
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

  public Cdconfirmapproved rows(List<Cdconfirmapprovedrow> rows) {
    this.rows = rows;
    return this;
  }

  public Cdconfirmapproved addRowsItem(Cdconfirmapprovedrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo schválený výdaj - řádek [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo schválený výdaj - řádek [nepersistentní položka]")
  public List<Cdconfirmapprovedrow> getRows() {
    return rows;
  }

  public void setRows(List<Cdconfirmapprovedrow> rows) {
    this.rows = rows;
  }

  public Cdconfirmapproved docqueueId(String docqueueId) {
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

  public Cdconfirmapproved periodId(String periodId) {
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

  public Cdconfirmapproved ordnumber(Integer ordnumber) {
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

  public Cdconfirmapproved docdatedate(DateTime docdatedate) {
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

  public Cdconfirmapproved createdbyId(String createdbyId) {
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

  public Cdconfirmapproved correctedbyId(String correctedbyId) {
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

  public Cdconfirmapproved newrelatedtype(Integer newrelatedtype) {
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

  public Cdconfirmapproved newrelateddocumentId(String newrelateddocumentId) {
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

  public Cdconfirmapproved priceprecision(Integer priceprecision) {
    this.priceprecision = priceprecision;
    return this;
  }

   /**
   * zobrazení desetinných míst pro zadávací částky [persistentní položka]
   * @return priceprecision
  **/
  @ApiModelProperty(example = "null", value = "zobrazení desetinných míst pro zadávací částky [persistentní položka]")
  public Integer getPriceprecision() {
    return priceprecision;
  }

  public void setPriceprecision(Integer priceprecision) {
    this.priceprecision = priceprecision;
  }

  public Cdconfirmapproved amount(Double amount) {
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

  public Cdconfirmapproved additionamount(Double additionamount) {
    this.additionamount = additionamount;
    return this;
  }

   /**
   * Částka fin. přínosu [persistentní položka]
   * @return additionamount
  **/
  @ApiModelProperty(example = "null", value = "Částka fin. přínosu [persistentní položka]")
  public Double getAdditionamount() {
    return additionamount;
  }

  public void setAdditionamount(Double additionamount) {
    this.additionamount = additionamount;
  }

  public Cdconfirmapproved description(String description) {
    this.description = description;
    return this;
  }

   /**
   * popis výdaje [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "popis výdaje [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Cdconfirmapproved description2(String description2) {
    this.description2 = description2;
    return this;
  }

   /**
   * popis fin. přínosu: [persistentní položka]
   * @return description2
  **/
  @ApiModelProperty(example = "null", value = "popis fin. přínosu: [persistentní položka]")
  public String getDescription2() {
    return description2;
  }

  public void setDescription2(String description2) {
    this.description2 = description2;
  }

  public Cdconfirmapproved validityfromdate(DateTime validityfromdate) {
    this.validityfromdate = validityfromdate;
    return this;
  }

   /**
   * platnost od [persistentní položka]
   * @return validityfromdate
  **/
  @ApiModelProperty(example = "null", value = "platnost od [persistentní položka]")
  public DateTime getValidityfromdate() {
    return validityfromdate;
  }

  public void setValidityfromdate(DateTime validityfromdate) {
    this.validityfromdate = validityfromdate;
  }

  public Cdconfirmapproved validitytodate(DateTime validitytodate) {
    this.validitytodate = validitytodate;
    return this;
  }

   /**
   * platnost do [persistentní položka]
   * @return validitytodate
  **/
  @ApiModelProperty(example = "null", value = "platnost do [persistentní položka]")
  public DateTime getValiditytodate() {
    return validitytodate;
  }

  public void setValiditytodate(DateTime validitytodate) {
    this.validitytodate = validitytodate;
  }

  public Cdconfirmapproved approvalId(String approvalId) {
    this.approvalId = approvalId;
    return this;
  }

   /**
   * vazba na schvalovaný výdaj; id objektu požadavek na schválení výdaje [persistentní položka]
   * @return approvalId
  **/
  @ApiModelProperty(example = "null", value = "vazba na schvalovaný výdaj; id objektu požadavek na schválení výdaje [persistentní položka]")
  public String getApprovalId() {
    return approvalId;
  }

  public void setApprovalId(String approvalId) {
    this.approvalId = approvalId;
  }

  public Cdconfirmapproved currencyId(String currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * měna schváleného výdaje; id objektu měna [persistentní položka]
   * @return currencyId
  **/
  @ApiModelProperty(example = "null", value = "měna schváleného výdaje; id objektu měna [persistentní položka]")
  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public Cdconfirmapproved drawingamount(Double drawingamount) {
    this.drawingamount = drawingamount;
    return this;
  }

   /**
   * Čerpaná částka
   * @return drawingamount
  **/
  @ApiModelProperty(example = "null", value = "Čerpaná částka")
  public Double getDrawingamount() {
    return drawingamount;
  }

  public void setDrawingamount(Double drawingamount) {
    this.drawingamount = drawingamount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cdconfirmapproved cdconfirmapproved = (Cdconfirmapproved) o;
    return Objects.equals(this.displayname, cdconfirmapproved.displayname) &&
        Objects.equals(this.id, cdconfirmapproved.id) &&
        Objects.equals(this.classid, cdconfirmapproved.classid) &&
        Objects.equals(this.objversion, cdconfirmapproved.objversion) &&
        Objects.equals(this.rows, cdconfirmapproved.rows) &&
        Objects.equals(this.docqueueId, cdconfirmapproved.docqueueId) &&
        Objects.equals(this.periodId, cdconfirmapproved.periodId) &&
        Objects.equals(this.ordnumber, cdconfirmapproved.ordnumber) &&
        Objects.equals(this.docdatedate, cdconfirmapproved.docdatedate) &&
        Objects.equals(this.createdbyId, cdconfirmapproved.createdbyId) &&
        Objects.equals(this.correctedbyId, cdconfirmapproved.correctedbyId) &&
        Objects.equals(this.newrelatedtype, cdconfirmapproved.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, cdconfirmapproved.newrelateddocumentId) &&
        Objects.equals(this.priceprecision, cdconfirmapproved.priceprecision) &&
        Objects.equals(this.amount, cdconfirmapproved.amount) &&
        Objects.equals(this.additionamount, cdconfirmapproved.additionamount) &&
        Objects.equals(this.description, cdconfirmapproved.description) &&
        Objects.equals(this.description2, cdconfirmapproved.description2) &&
        Objects.equals(this.validityfromdate, cdconfirmapproved.validityfromdate) &&
        Objects.equals(this.validitytodate, cdconfirmapproved.validitytodate) &&
        Objects.equals(this.approvalId, cdconfirmapproved.approvalId) &&
        Objects.equals(this.currencyId, cdconfirmapproved.currencyId) &&
        Objects.equals(this.drawingamount, cdconfirmapproved.drawingamount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, docqueueId, periodId, ordnumber, docdatedate, createdbyId, correctedbyId, newrelatedtype, newrelateddocumentId, priceprecision, amount, additionamount, description, description2, validityfromdate, validitytodate, approvalId, currencyId, drawingamount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cdconfirmapproved {\n");
    
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
    sb.append("    priceprecision: ").append(toIndentedString(priceprecision)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    additionamount: ").append(toIndentedString(additionamount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
    sb.append("    validityfromdate: ").append(toIndentedString(validityfromdate)).append("\n");
    sb.append("    validitytodate: ").append(toIndentedString(validitytodate)).append("\n");
    sb.append("    approvalId: ").append(toIndentedString(approvalId)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    drawingamount: ").append(toIndentedString(drawingamount)).append("\n");
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

