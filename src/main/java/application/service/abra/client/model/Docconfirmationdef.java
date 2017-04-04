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
 * Docconfirmationdef
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Docconfirmationdef   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("doctype")
  private String doctype = null;

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("creatorrole_id")
  private String creatorroleId = null;

  @SerializedName("condition")
  private String condition = null;

  @SerializedName("confirmatorrole_id")
  private String confirmatorroleId = null;

  @SerializedName("confirmatoruser_id")
  private String confirmatoruserId = null;

  @SerializedName("confirmatororder")
  private Integer confirmatororder = null;

  @SerializedName("evaluateconfirmator")
  private Boolean evaluateconfirmator = null;

  @SerializedName("expressionforevalconfirmator")
  private String expressionforevalconfirmator = null;

  public Docconfirmationdef displayname(String displayname) {
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

  public Docconfirmationdef id(String id) {
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

  public Docconfirmationdef classid(String classid) {
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

  public Docconfirmationdef objversion(Integer objversion) {
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

  public Docconfirmationdef doctype(String doctype) {
    this.doctype = doctype;
    return this;
  }

   /**
   * typ dokladu [persistentní položka]
   * @return doctype
  **/
  @ApiModelProperty(example = "null", value = "typ dokladu [persistentní položka]")
  public String getDoctype() {
    return doctype;
  }

  public void setDoctype(String doctype) {
    this.doctype = doctype;
  }

  public Docconfirmationdef docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * Řada dokladů; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "Řada dokladů; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Docconfirmationdef createdbyId(String createdbyId) {
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

  public Docconfirmationdef correctedbyId(String correctedbyId) {
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

  public Docconfirmationdef creatorroleId(String creatorroleId) {
    this.creatorroleId = creatorroleId;
    return this;
  }

   /**
   * tvůrce dokladu; id objektu role [persistentní položka]
   * @return creatorroleId
  **/
  @ApiModelProperty(example = "null", value = "tvůrce dokladu; id objektu role [persistentní položka]")
  public String getCreatorroleId() {
    return creatorroleId;
  }

  public void setCreatorroleId(String creatorroleId) {
    this.creatorroleId = creatorroleId;
  }

  public Docconfirmationdef condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * podmínka [persistentní položka]
   * @return condition
  **/
  @ApiModelProperty(example = "null", value = "podmínka [persistentní položka]")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public Docconfirmationdef confirmatorroleId(String confirmatorroleId) {
    this.confirmatorroleId = confirmatorroleId;
    return this;
  }

   /**
   * role schvalovatele; id objektu role [persistentní položka]
   * @return confirmatorroleId
  **/
  @ApiModelProperty(example = "null", value = "role schvalovatele; id objektu role [persistentní položka]")
  public String getConfirmatorroleId() {
    return confirmatorroleId;
  }

  public void setConfirmatorroleId(String confirmatorroleId) {
    this.confirmatorroleId = confirmatorroleId;
  }

  public Docconfirmationdef confirmatoruserId(String confirmatoruserId) {
    this.confirmatoruserId = confirmatoruserId;
    return this;
  }

   /**
   * schvalovatel; id objektu uživatel [persistentní položka]
   * @return confirmatoruserId
  **/
  @ApiModelProperty(example = "null", value = "schvalovatel; id objektu uživatel [persistentní položka]")
  public String getConfirmatoruserId() {
    return confirmatoruserId;
  }

  public void setConfirmatoruserId(String confirmatoruserId) {
    this.confirmatoruserId = confirmatoruserId;
  }

  public Docconfirmationdef confirmatororder(Integer confirmatororder) {
    this.confirmatororder = confirmatororder;
    return this;
  }

   /**
   * pořadí schvalovatele [persistentní položka]
   * @return confirmatororder
  **/
  @ApiModelProperty(example = "null", value = "pořadí schvalovatele [persistentní položka]")
  public Integer getConfirmatororder() {
    return confirmatororder;
  }

  public void setConfirmatororder(Integer confirmatororder) {
    this.confirmatororder = confirmatororder;
  }

  public Docconfirmationdef evaluateconfirmator(Boolean evaluateconfirmator) {
    this.evaluateconfirmator = evaluateconfirmator;
    return this;
  }

   /**
   * schvalovatel výrazem [persistentní položka]
   * @return evaluateconfirmator
  **/
  @ApiModelProperty(example = "null", value = "schvalovatel výrazem [persistentní položka]")
  public Boolean getEvaluateconfirmator() {
    return evaluateconfirmator;
  }

  public void setEvaluateconfirmator(Boolean evaluateconfirmator) {
    this.evaluateconfirmator = evaluateconfirmator;
  }

  public Docconfirmationdef expressionforevalconfirmator(String expressionforevalconfirmator) {
    this.expressionforevalconfirmator = expressionforevalconfirmator;
    return this;
  }

   /**
   * výraz pro vyhodnocení role resp. uživatele, který provádí schvalování [persistentní položka]
   * @return expressionforevalconfirmator
  **/
  @ApiModelProperty(example = "null", value = "výraz pro vyhodnocení role resp. uživatele, který provádí schvalování [persistentní položka]")
  public String getExpressionforevalconfirmator() {
    return expressionforevalconfirmator;
  }

  public void setExpressionforevalconfirmator(String expressionforevalconfirmator) {
    this.expressionforevalconfirmator = expressionforevalconfirmator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Docconfirmationdef docconfirmationdef = (Docconfirmationdef) o;
    return Objects.equals(this.displayname, docconfirmationdef.displayname) &&
        Objects.equals(this.id, docconfirmationdef.id) &&
        Objects.equals(this.classid, docconfirmationdef.classid) &&
        Objects.equals(this.objversion, docconfirmationdef.objversion) &&
        Objects.equals(this.doctype, docconfirmationdef.doctype) &&
        Objects.equals(this.docqueueId, docconfirmationdef.docqueueId) &&
        Objects.equals(this.createdbyId, docconfirmationdef.createdbyId) &&
        Objects.equals(this.correctedbyId, docconfirmationdef.correctedbyId) &&
        Objects.equals(this.creatorroleId, docconfirmationdef.creatorroleId) &&
        Objects.equals(this.condition, docconfirmationdef.condition) &&
        Objects.equals(this.confirmatorroleId, docconfirmationdef.confirmatorroleId) &&
        Objects.equals(this.confirmatoruserId, docconfirmationdef.confirmatoruserId) &&
        Objects.equals(this.confirmatororder, docconfirmationdef.confirmatororder) &&
        Objects.equals(this.evaluateconfirmator, docconfirmationdef.evaluateconfirmator) &&
        Objects.equals(this.expressionforevalconfirmator, docconfirmationdef.expressionforevalconfirmator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, doctype, docqueueId, createdbyId, correctedbyId, creatorroleId, condition, confirmatorroleId, confirmatoruserId, confirmatororder, evaluateconfirmator, expressionforevalconfirmator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Docconfirmationdef {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    doctype: ").append(toIndentedString(doctype)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    creatorroleId: ").append(toIndentedString(creatorroleId)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    confirmatorroleId: ").append(toIndentedString(confirmatorroleId)).append("\n");
    sb.append("    confirmatoruserId: ").append(toIndentedString(confirmatoruserId)).append("\n");
    sb.append("    confirmatororder: ").append(toIndentedString(confirmatororder)).append("\n");
    sb.append("    evaluateconfirmator: ").append(toIndentedString(evaluateconfirmator)).append("\n");
    sb.append("    expressionforevalconfirmator: ").append(toIndentedString(expressionforevalconfirmator)).append("\n");
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
