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

import java.util.Objects;


/**
 * Paymentorderdocument
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Paymentorderdocument   {
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

  @SerializedName("pdocument_id")
  private String pdocumentId = null;

  @SerializedName("pdocumenttype")
  private String pdocumenttype = null;

  @SerializedName("amount")
  private Double amount = null;

  public Paymentorderdocument displayname(String displayname) {
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

  public Paymentorderdocument id(String id) {
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

  public Paymentorderdocument classid(String classid) {
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

  public Paymentorderdocument objversion(Integer objversion) {
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

  public Paymentorderdocument parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu platební příkaz - řádek [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu platební příkaz - řádek [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Paymentorderdocument pdocumentId(String pdocumentId) {
    this.pdocumentId = pdocumentId;
    return this;
  }

   /**
   * placený doklad; id objektu dokument [persistentní položka]
   * @return pdocumentId
  **/
  @ApiModelProperty(example = "null", value = "placený doklad; id objektu dokument [persistentní položka]")
  public String getPdocumentId() {
    return pdocumentId;
  }

  public void setPdocumentId(String pdocumentId) {
    this.pdocumentId = pdocumentId;
  }

  public Paymentorderdocument pdocumenttype(String pdocumenttype) {
    this.pdocumenttype = pdocumenttype;
    return this;
  }

   /**
   * typ plac. dokladu [persistentní položka]
   * @return pdocumenttype
  **/
  @ApiModelProperty(example = "null", value = "typ plac. dokladu [persistentní položka]")
  public String getPdocumenttype() {
    return pdocumenttype;
  }

  public void setPdocumenttype(String pdocumenttype) {
    this.pdocumenttype = pdocumenttype;
  }

  public Paymentorderdocument amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * placená částka dokl. [persistentní položka]
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "placená částka dokl. [persistentní položka]")
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
    Paymentorderdocument paymentorderdocument = (Paymentorderdocument) o;
    return Objects.equals(this.displayname, paymentorderdocument.displayname) &&
        Objects.equals(this.id, paymentorderdocument.id) &&
        Objects.equals(this.classid, paymentorderdocument.classid) &&
        Objects.equals(this.objversion, paymentorderdocument.objversion) &&
        Objects.equals(this.parentId, paymentorderdocument.parentId) &&
        Objects.equals(this.pdocumentId, paymentorderdocument.pdocumentId) &&
        Objects.equals(this.pdocumenttype, paymentorderdocument.pdocumenttype) &&
        Objects.equals(this.amount, paymentorderdocument.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, pdocumentId, pdocumenttype, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paymentorderdocument {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    pdocumentId: ").append(toIndentedString(pdocumentId)).append("\n");
    sb.append("    pdocumenttype: ").append(toIndentedString(pdocumenttype)).append("\n");
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

