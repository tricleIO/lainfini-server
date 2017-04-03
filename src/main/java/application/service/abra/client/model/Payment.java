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
 * Payment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Payment   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("document_id")
  private String documentId = null;

  @SerializedName("documenttype")
  private String documenttype = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("pdocument_id")
  private String pdocumentId = null;

  @SerializedName("pdocumenttype")
  private String pdocumenttype = null;

  @SerializedName("row_id")
  private String rowId = null;

  @SerializedName("localamount")
  private Double localamount = null;

  @SerializedName("vatdate$date")
  private DateTime vatdatedate = null;

  @SerializedName("tamountwithoutvat")
  private Double tamountwithoutvat = null;

  @SerializedName("localtamountwithoutvat")
  private Double localtamountwithoutvat = null;

  @SerializedName("tamount")
  private Double tamount = null;

  @SerializedName("localtamount")
  private Double localtamount = null;

  @SerializedName("localamountwithoutvateet")
  private Double localamountwithoutvateet = null;

  @SerializedName("localamounteet")
  private Double localamounteet = null;

  public Payment displayname(String displayname) {
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

  public Payment id(String id) {
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

  public Payment classid(String classid) {
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

  public Payment objversion(Integer objversion) {
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

  public Payment documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * plateb.dokl.; id objektu dokument [persistentní položka]
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "plateb.dokl.; id objektu dokument [persistentní položka]")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Payment documenttype(String documenttype) {
    this.documenttype = documenttype;
    return this;
  }

   /**
   * typ plateb.dokl. [persistentní položka]
   * @return documenttype
  **/
  @ApiModelProperty(example = "null", value = "typ plateb.dokl. [persistentní položka]")
  public String getDocumenttype() {
    return documenttype;
  }

  public void setDocumenttype(String documenttype) {
    this.documenttype = documenttype;
  }

  public Payment amount(Double amount) {
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

  public Payment pdocumentId(String pdocumentId) {
    this.pdocumentId = pdocumentId;
    return this;
  }

   /**
   * plac.dokl.; id objektu dokument [persistentní položka]
   * @return pdocumentId
  **/
  @ApiModelProperty(example = "null", value = "plac.dokl.; id objektu dokument [persistentní položka]")
  public String getPdocumentId() {
    return pdocumentId;
  }

  public void setPdocumentId(String pdocumentId) {
    this.pdocumentId = pdocumentId;
  }

  public Payment pdocumenttype(String pdocumenttype) {
    this.pdocumenttype = pdocumenttype;
    return this;
  }

   /**
   * typ plac.dokl. [persistentní položka]
   * @return pdocumenttype
  **/
  @ApiModelProperty(example = "null", value = "typ plac.dokl. [persistentní položka]")
  public String getPdocumenttype() {
    return pdocumenttype;
  }

  public void setPdocumenttype(String pdocumenttype) {
    this.pdocumenttype = pdocumenttype;
  }

  public Payment rowId(String rowId) {
    this.rowId = rowId;
    return this;
  }

   /**
   * Řádek plac.dokl.; id objektu Řádek [persistentní položka]
   * @return rowId
  **/
  @ApiModelProperty(example = "null", value = "Řádek plac.dokl.; id objektu Řádek [persistentní položka]")
  public String getRowId() {
    return rowId;
  }

  public void setRowId(String rowId) {
    this.rowId = rowId;
  }

  public Payment localamount(Double localamount) {
    this.localamount = localamount;
    return this;
  }

   /**
   * Částka (lok.) [persistentní položka]
   * @return localamount
  **/
  @ApiModelProperty(example = "null", value = "Částka (lok.) [persistentní položka]")
  public Double getLocalamount() {
    return localamount;
  }

  public void setLocalamount(Double localamount) {
    this.localamount = localamount;
  }

  public Payment vatdatedate(DateTime vatdatedate) {
    this.vatdatedate = vatdatedate;
    return this;
  }

   /**
   * datum plnění/odpočtu [persistentní položka]
   * @return vatdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum plnění/odpočtu [persistentní položka]")
  public DateTime getVatdatedate() {
    return vatdatedate;
  }

  public void setVatdatedate(DateTime vatdatedate) {
    this.vatdatedate = vatdatedate;
  }

  public Payment tamountwithoutvat(Double tamountwithoutvat) {
    this.tamountwithoutvat = tamountwithoutvat;
    return this;
  }

   /**
   * bez daně [persistentní položka]
   * @return tamountwithoutvat
  **/
  @ApiModelProperty(example = "null", value = "bez daně [persistentní položka]")
  public Double getTamountwithoutvat() {
    return tamountwithoutvat;
  }

  public void setTamountwithoutvat(Double tamountwithoutvat) {
    this.tamountwithoutvat = tamountwithoutvat;
  }

  public Payment localtamountwithoutvat(Double localtamountwithoutvat) {
    this.localtamountwithoutvat = localtamountwithoutvat;
    return this;
  }

   /**
   * bez daně lokálně [persistentní položka]
   * @return localtamountwithoutvat
  **/
  @ApiModelProperty(example = "null", value = "bez daně lokálně [persistentní položka]")
  public Double getLocaltamountwithoutvat() {
    return localtamountwithoutvat;
  }

  public void setLocaltamountwithoutvat(Double localtamountwithoutvat) {
    this.localtamountwithoutvat = localtamountwithoutvat;
  }

  public Payment tamount(Double tamount) {
    this.tamount = tamount;
    return this;
  }

   /**
   * celkem [persistentní položka]
   * @return tamount
  **/
  @ApiModelProperty(example = "null", value = "celkem [persistentní položka]")
  public Double getTamount() {
    return tamount;
  }

  public void setTamount(Double tamount) {
    this.tamount = tamount;
  }

  public Payment localtamount(Double localtamount) {
    this.localtamount = localtamount;
    return this;
  }

   /**
   * celkem lokálně [persistentní položka]
   * @return localtamount
  **/
  @ApiModelProperty(example = "null", value = "celkem lokálně [persistentní položka]")
  public Double getLocaltamount() {
    return localtamount;
  }

  public void setLocaltamount(Double localtamount) {
    this.localtamount = localtamount;
  }

  public Payment localamountwithoutvateet(Double localamountwithoutvateet) {
    this.localamountwithoutvateet = localamountwithoutvateet;
    return this;
  }

   /**
   * Částka bez daně (lok.) využitá do tržby eet [persistentní položka]
   * @return localamountwithoutvateet
  **/
  @ApiModelProperty(example = "null", value = "Částka bez daně (lok.) využitá do tržby eet [persistentní položka]")
  public Double getLocalamountwithoutvateet() {
    return localamountwithoutvateet;
  }

  public void setLocalamountwithoutvateet(Double localamountwithoutvateet) {
    this.localamountwithoutvateet = localamountwithoutvateet;
  }

  public Payment localamounteet(Double localamounteet) {
    this.localamounteet = localamounteet;
    return this;
  }

   /**
   * Částka (lok.) [persistentní položka]
   * @return localamounteet
  **/
  @ApiModelProperty(example = "null", value = "Částka (lok.) [persistentní položka]")
  public Double getLocalamounteet() {
    return localamounteet;
  }

  public void setLocalamounteet(Double localamounteet) {
    this.localamounteet = localamounteet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.displayname, payment.displayname) &&
        Objects.equals(this.id, payment.id) &&
        Objects.equals(this.classid, payment.classid) &&
        Objects.equals(this.objversion, payment.objversion) &&
        Objects.equals(this.documentId, payment.documentId) &&
        Objects.equals(this.documenttype, payment.documenttype) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.pdocumentId, payment.pdocumentId) &&
        Objects.equals(this.pdocumenttype, payment.pdocumenttype) &&
        Objects.equals(this.rowId, payment.rowId) &&
        Objects.equals(this.localamount, payment.localamount) &&
        Objects.equals(this.vatdatedate, payment.vatdatedate) &&
        Objects.equals(this.tamountwithoutvat, payment.tamountwithoutvat) &&
        Objects.equals(this.localtamountwithoutvat, payment.localtamountwithoutvat) &&
        Objects.equals(this.tamount, payment.tamount) &&
        Objects.equals(this.localtamount, payment.localtamount) &&
        Objects.equals(this.localamountwithoutvateet, payment.localamountwithoutvateet) &&
        Objects.equals(this.localamounteet, payment.localamounteet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, documentId, documenttype, amount, pdocumentId, pdocumenttype, rowId, localamount, vatdatedate, tamountwithoutvat, localtamountwithoutvat, tamount, localtamount, localamountwithoutvateet, localamounteet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documenttype: ").append(toIndentedString(documenttype)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    pdocumentId: ").append(toIndentedString(pdocumentId)).append("\n");
    sb.append("    pdocumenttype: ").append(toIndentedString(pdocumenttype)).append("\n");
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
    sb.append("    localamount: ").append(toIndentedString(localamount)).append("\n");
    sb.append("    vatdatedate: ").append(toIndentedString(vatdatedate)).append("\n");
    sb.append("    tamountwithoutvat: ").append(toIndentedString(tamountwithoutvat)).append("\n");
    sb.append("    localtamountwithoutvat: ").append(toIndentedString(localtamountwithoutvat)).append("\n");
    sb.append("    tamount: ").append(toIndentedString(tamount)).append("\n");
    sb.append("    localtamount: ").append(toIndentedString(localtamount)).append("\n");
    sb.append("    localamountwithoutvateet: ").append(toIndentedString(localamountwithoutvateet)).append("\n");
    sb.append("    localamounteet: ").append(toIndentedString(localamounteet)).append("\n");
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

