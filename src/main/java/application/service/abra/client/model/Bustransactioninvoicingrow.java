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
 * Bustransactioninvoicingrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Bustransactioninvoicingrow   {
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

  @SerializedName("doctype")
  private String doctype = null;

  @SerializedName("document_id")
  private String documentId = null;

  @SerializedName("row_id")
  private String rowId = null;

  @SerializedName("docdate$date")
  private DateTime docdatedate = null;

  @SerializedName("docdispname")
  private String docdispname = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("amount")
  private Double amount = null;

  public Bustransactioninvoicingrow displayname(String displayname) {
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

  public Bustransactioninvoicingrow id(String id) {
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

  public Bustransactioninvoicingrow classid(String classid) {
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

  public Bustransactioninvoicingrow objversion(Integer objversion) {
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

  public Bustransactioninvoicingrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu obchodní případ - vyúčtování fakturace [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu obchodní případ - vyúčtování fakturace [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Bustransactioninvoicingrow doctype(String doctype) {
    this.doctype = doctype;
    return this;
  }

   /**
   * typ [persistentní položka]
   * @return doctype
  **/
  @ApiModelProperty(example = "null", value = "typ [persistentní položka]")
  public String getDoctype() {
    return doctype;
  }

  public void setDoctype(String doctype) {
    this.doctype = doctype;
  }

  public Bustransactioninvoicingrow documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * doklad; id objektu výstupní doklad [persistentní položka]
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "doklad; id objektu výstupní doklad [persistentní položka]")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Bustransactioninvoicingrow rowId(String rowId) {
    this.rowId = rowId;
    return this;
  }

   /**
   * Řádek; id objektu Řádek výstupního dokladu [persistentní položka]
   * @return rowId
  **/
  @ApiModelProperty(example = "null", value = "Řádek; id objektu Řádek výstupního dokladu [persistentní položka]")
  public String getRowId() {
    return rowId;
  }

  public void setRowId(String rowId) {
    this.rowId = rowId;
  }

  public Bustransactioninvoicingrow docdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
    return this;
  }

   /**
   * datum [persistentní položka]
   * @return docdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum [persistentní položka]")
  public DateTime getDocdatedate() {
    return docdatedate;
  }

  public void setDocdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
  }

  public Bustransactioninvoicingrow docdispname(String docdispname) {
    this.docdispname = docdispname;
    return this;
  }

   /**
   * Číslo dokladu [persistentní položka]
   * @return docdispname
  **/
  @ApiModelProperty(example = "null", value = "Číslo dokladu [persistentní položka]")
  public String getDocdispname() {
    return docdispname;
  }

  public void setDocdispname(String docdispname) {
    this.docdispname = docdispname;
  }

  public Bustransactioninvoicingrow quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * množství [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "množství [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Bustransactioninvoicingrow amount(Double amount) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bustransactioninvoicingrow bustransactioninvoicingrow = (Bustransactioninvoicingrow) o;
    return Objects.equals(this.displayname, bustransactioninvoicingrow.displayname) &&
        Objects.equals(this.id, bustransactioninvoicingrow.id) &&
        Objects.equals(this.classid, bustransactioninvoicingrow.classid) &&
        Objects.equals(this.objversion, bustransactioninvoicingrow.objversion) &&
        Objects.equals(this.parentId, bustransactioninvoicingrow.parentId) &&
        Objects.equals(this.doctype, bustransactioninvoicingrow.doctype) &&
        Objects.equals(this.documentId, bustransactioninvoicingrow.documentId) &&
        Objects.equals(this.rowId, bustransactioninvoicingrow.rowId) &&
        Objects.equals(this.docdatedate, bustransactioninvoicingrow.docdatedate) &&
        Objects.equals(this.docdispname, bustransactioninvoicingrow.docdispname) &&
        Objects.equals(this.quantity, bustransactioninvoicingrow.quantity) &&
        Objects.equals(this.amount, bustransactioninvoicingrow.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, doctype, documentId, rowId, docdatedate, docdispname, quantity, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bustransactioninvoicingrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    doctype: ").append(toIndentedString(doctype)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
    sb.append("    docdatedate: ").append(toIndentedString(docdatedate)).append("\n");
    sb.append("    docdispname: ").append(toIndentedString(docdispname)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

