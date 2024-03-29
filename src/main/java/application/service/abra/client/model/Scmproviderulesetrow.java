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
 * Scmproviderulesetrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Scmproviderulesetrow   {
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

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("condition")
  private String condition = null;

  @SerializedName("builderclsid")
  private String builderclsid = null;

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("firmexpr")
  private String firmexpr = null;

  @SerializedName("firmofficeexpr")
  private String firmofficeexpr = null;

  @SerializedName("divisionexpr")
  private String divisionexpr = null;

  @SerializedName("busorderexpr")
  private String busorderexpr = null;

  @SerializedName("bustransactionexpr")
  private String bustransactionexpr = null;

  @SerializedName("busprojectexpr")
  private String busprojectexpr = null;

  @SerializedName("function_id")
  private String functionId = null;

  @SerializedName("continueevaluation")
  private Boolean continueevaluation = null;

  @SerializedName("storeexpr")
  private String storeexpr = null;

  @SerializedName("quantityexpr")
  private String quantityexpr = null;

  @SerializedName("qunitexpr")
  private String qunitexpr = null;

  @SerializedName("dateexpr")
  private String dateexpr = null;

  @SerializedName("sourcestoreexpr")
  private String sourcestoreexpr = null;

  @SerializedName("targetdocqueue_id")
  private String targetdocqueueId = null;

  public Scmproviderulesetrow displayname(String displayname) {
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

  public Scmproviderulesetrow id(String id) {
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

  public Scmproviderulesetrow classid(String classid) {
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

  public Scmproviderulesetrow objversion(Integer objversion) {
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

  public Scmproviderulesetrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu pravidlo pro zajištění zdrojů [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu pravidlo pro zajištění zdrojů [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Scmproviderulesetrow posindex(Integer posindex) {
    this.posindex = posindex;
    return this;
  }

   /**
   * pořadí [persistentní položka]
   * @return posindex
  **/
  @ApiModelProperty(example = "null", value = "pořadí [persistentní položka]")
  public Integer getPosindex() {
    return posindex;
  }

  public void setPosindex(Integer posindex) {
    this.posindex = posindex;
  }

  public Scmproviderulesetrow condition(String condition) {
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

  public Scmproviderulesetrow builderclsid(String builderclsid) {
    this.builderclsid = builderclsid;
    return this;
  }

   /**
   * typ dokumentu [persistentní položka]
   * @return builderclsid
  **/
  @ApiModelProperty(example = "null", value = "typ dokumentu [persistentní položka]")
  public String getBuilderclsid() {
    return builderclsid;
  }

  public void setBuilderclsid(String builderclsid) {
    this.builderclsid = builderclsid;
  }

  public Scmproviderulesetrow docqueueId(String docqueueId) {
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

  public Scmproviderulesetrow firmexpr(String firmexpr) {
    this.firmexpr = firmexpr;
    return this;
  }

   /**
   * výraz firmy [persistentní položka]
   * @return firmexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz firmy [persistentní položka]")
  public String getFirmexpr() {
    return firmexpr;
  }

  public void setFirmexpr(String firmexpr) {
    this.firmexpr = firmexpr;
  }

  public Scmproviderulesetrow firmofficeexpr(String firmofficeexpr) {
    this.firmofficeexpr = firmofficeexpr;
    return this;
  }

   /**
   * výraz provozovny [persistentní položka]
   * @return firmofficeexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz provozovny [persistentní položka]")
  public String getFirmofficeexpr() {
    return firmofficeexpr;
  }

  public void setFirmofficeexpr(String firmofficeexpr) {
    this.firmofficeexpr = firmofficeexpr;
  }

  public Scmproviderulesetrow divisionexpr(String divisionexpr) {
    this.divisionexpr = divisionexpr;
    return this;
  }

   /**
   * výraz střediska [persistentní položka]
   * @return divisionexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz střediska [persistentní položka]")
  public String getDivisionexpr() {
    return divisionexpr;
  }

  public void setDivisionexpr(String divisionexpr) {
    this.divisionexpr = divisionexpr;
  }

  public Scmproviderulesetrow busorderexpr(String busorderexpr) {
    this.busorderexpr = busorderexpr;
    return this;
  }

   /**
   * výraz zakázky [persistentní položka]
   * @return busorderexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz zakázky [persistentní položka]")
  public String getBusorderexpr() {
    return busorderexpr;
  }

  public void setBusorderexpr(String busorderexpr) {
    this.busorderexpr = busorderexpr;
  }

  public Scmproviderulesetrow bustransactionexpr(String bustransactionexpr) {
    this.bustransactionexpr = bustransactionexpr;
    return this;
  }

   /**
   * výraz obch. případu [persistentní položka]
   * @return bustransactionexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz obch. případu [persistentní položka]")
  public String getBustransactionexpr() {
    return bustransactionexpr;
  }

  public void setBustransactionexpr(String bustransactionexpr) {
    this.bustransactionexpr = bustransactionexpr;
  }

  public Scmproviderulesetrow busprojectexpr(String busprojectexpr) {
    this.busprojectexpr = busprojectexpr;
    return this;
  }

   /**
   * výraz projektu [persistentní položka]
   * @return busprojectexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz projektu [persistentní položka]")
  public String getBusprojectexpr() {
    return busprojectexpr;
  }

  public void setBusprojectexpr(String busprojectexpr) {
    this.busprojectexpr = busprojectexpr;
  }

  public Scmproviderulesetrow functionId(String functionId) {
    this.functionId = functionId;
    return this;
  }

   /**
   * funkce pro zajištění; id objektu funkce zajištění zdrojů [persistentní položka]
   * @return functionId
  **/
  @ApiModelProperty(example = "null", value = "funkce pro zajištění; id objektu funkce zajištění zdrojů [persistentní položka]")
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  public Scmproviderulesetrow continueevaluation(Boolean continueevaluation) {
    this.continueevaluation = continueevaluation;
    return this;
  }

   /**
   * pokračovat [persistentní položka]
   * @return continueevaluation
  **/
  @ApiModelProperty(example = "null", value = "pokračovat [persistentní položka]")
  public Boolean getContinueevaluation() {
    return continueevaluation;
  }

  public void setContinueevaluation(Boolean continueevaluation) {
    this.continueevaluation = continueevaluation;
  }

  public Scmproviderulesetrow storeexpr(String storeexpr) {
    this.storeexpr = storeexpr;
    return this;
  }

   /**
   * výraz skladu [persistentní položka]
   * @return storeexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz skladu [persistentní položka]")
  public String getStoreexpr() {
    return storeexpr;
  }

  public void setStoreexpr(String storeexpr) {
    this.storeexpr = storeexpr;
  }

  public Scmproviderulesetrow quantityexpr(String quantityexpr) {
    this.quantityexpr = quantityexpr;
    return this;
  }

   /**
   * výraz pro množství [persistentní položka]
   * @return quantityexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz pro množství [persistentní položka]")
  public String getQuantityexpr() {
    return quantityexpr;
  }

  public void setQuantityexpr(String quantityexpr) {
    this.quantityexpr = quantityexpr;
  }

  public Scmproviderulesetrow qunitexpr(String qunitexpr) {
    this.qunitexpr = qunitexpr;
    return this;
  }

   /**
   * výraz pro jednotku [persistentní položka]
   * @return qunitexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz pro jednotku [persistentní položka]")
  public String getQunitexpr() {
    return qunitexpr;
  }

  public void setQunitexpr(String qunitexpr) {
    this.qunitexpr = qunitexpr;
  }

  public Scmproviderulesetrow dateexpr(String dateexpr) {
    this.dateexpr = dateexpr;
    return this;
  }

   /**
   * výraz pro datum [persistentní položka]
   * @return dateexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz pro datum [persistentní položka]")
  public String getDateexpr() {
    return dateexpr;
  }

  public void setDateexpr(String dateexpr) {
    this.dateexpr = dateexpr;
  }

  public Scmproviderulesetrow sourcestoreexpr(String sourcestoreexpr) {
    this.sourcestoreexpr = sourcestoreexpr;
    return this;
  }

   /**
   * výraz zdrojového skladu [persistentní položka]
   * @return sourcestoreexpr
  **/
  @ApiModelProperty(example = "null", value = "výraz zdrojového skladu [persistentní položka]")
  public String getSourcestoreexpr() {
    return sourcestoreexpr;
  }

  public void setSourcestoreexpr(String sourcestoreexpr) {
    this.sourcestoreexpr = sourcestoreexpr;
  }

  public Scmproviderulesetrow targetdocqueueId(String targetdocqueueId) {
    this.targetdocqueueId = targetdocqueueId;
    return this;
  }

   /**
   * cílová řada dokladů; id objektu Řada dokladů [persistentní položka]
   * @return targetdocqueueId
  **/
  @ApiModelProperty(example = "null", value = "cílová řada dokladů; id objektu Řada dokladů [persistentní položka]")
  public String getTargetdocqueueId() {
    return targetdocqueueId;
  }

  public void setTargetdocqueueId(String targetdocqueueId) {
    this.targetdocqueueId = targetdocqueueId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scmproviderulesetrow scmproviderulesetrow = (Scmproviderulesetrow) o;
    return Objects.equals(this.displayname, scmproviderulesetrow.displayname) &&
        Objects.equals(this.id, scmproviderulesetrow.id) &&
        Objects.equals(this.classid, scmproviderulesetrow.classid) &&
        Objects.equals(this.objversion, scmproviderulesetrow.objversion) &&
        Objects.equals(this.parentId, scmproviderulesetrow.parentId) &&
        Objects.equals(this.posindex, scmproviderulesetrow.posindex) &&
        Objects.equals(this.condition, scmproviderulesetrow.condition) &&
        Objects.equals(this.builderclsid, scmproviderulesetrow.builderclsid) &&
        Objects.equals(this.docqueueId, scmproviderulesetrow.docqueueId) &&
        Objects.equals(this.firmexpr, scmproviderulesetrow.firmexpr) &&
        Objects.equals(this.firmofficeexpr, scmproviderulesetrow.firmofficeexpr) &&
        Objects.equals(this.divisionexpr, scmproviderulesetrow.divisionexpr) &&
        Objects.equals(this.busorderexpr, scmproviderulesetrow.busorderexpr) &&
        Objects.equals(this.bustransactionexpr, scmproviderulesetrow.bustransactionexpr) &&
        Objects.equals(this.busprojectexpr, scmproviderulesetrow.busprojectexpr) &&
        Objects.equals(this.functionId, scmproviderulesetrow.functionId) &&
        Objects.equals(this.continueevaluation, scmproviderulesetrow.continueevaluation) &&
        Objects.equals(this.storeexpr, scmproviderulesetrow.storeexpr) &&
        Objects.equals(this.quantityexpr, scmproviderulesetrow.quantityexpr) &&
        Objects.equals(this.qunitexpr, scmproviderulesetrow.qunitexpr) &&
        Objects.equals(this.dateexpr, scmproviderulesetrow.dateexpr) &&
        Objects.equals(this.sourcestoreexpr, scmproviderulesetrow.sourcestoreexpr) &&
        Objects.equals(this.targetdocqueueId, scmproviderulesetrow.targetdocqueueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, condition, builderclsid, docqueueId, firmexpr, firmofficeexpr, divisionexpr, busorderexpr, bustransactionexpr, busprojectexpr, functionId, continueevaluation, storeexpr, quantityexpr, qunitexpr, dateexpr, sourcestoreexpr, targetdocqueueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scmproviderulesetrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    builderclsid: ").append(toIndentedString(builderclsid)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    firmexpr: ").append(toIndentedString(firmexpr)).append("\n");
    sb.append("    firmofficeexpr: ").append(toIndentedString(firmofficeexpr)).append("\n");
    sb.append("    divisionexpr: ").append(toIndentedString(divisionexpr)).append("\n");
    sb.append("    busorderexpr: ").append(toIndentedString(busorderexpr)).append("\n");
    sb.append("    bustransactionexpr: ").append(toIndentedString(bustransactionexpr)).append("\n");
    sb.append("    busprojectexpr: ").append(toIndentedString(busprojectexpr)).append("\n");
    sb.append("    functionId: ").append(toIndentedString(functionId)).append("\n");
    sb.append("    continueevaluation: ").append(toIndentedString(continueevaluation)).append("\n");
    sb.append("    storeexpr: ").append(toIndentedString(storeexpr)).append("\n");
    sb.append("    quantityexpr: ").append(toIndentedString(quantityexpr)).append("\n");
    sb.append("    qunitexpr: ").append(toIndentedString(qunitexpr)).append("\n");
    sb.append("    dateexpr: ").append(toIndentedString(dateexpr)).append("\n");
    sb.append("    sourcestoreexpr: ").append(toIndentedString(sourcestoreexpr)).append("\n");
    sb.append("    targetdocqueueId: ").append(toIndentedString(targetdocqueueId)).append("\n");
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

