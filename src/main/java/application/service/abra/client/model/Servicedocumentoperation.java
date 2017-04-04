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
 * Servicedocumentoperation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Servicedocumentoperation   {
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

  @SerializedName("operationtext")
  private String operationtext = null;

  @SerializedName("documentdefect_id")
  private String documentdefectId = null;

  @SerializedName("serviceoperation_id")
  private String serviceoperationId = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("workoperationtime")
  private Double workoperationtime = null;

  @SerializedName("defectcode")
  private String defectcode = null;

  public Servicedocumentoperation displayname(String displayname) {
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

  public Servicedocumentoperation id(String id) {
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

  public Servicedocumentoperation classid(String classid) {
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

  public Servicedocumentoperation objversion(Integer objversion) {
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

  public Servicedocumentoperation parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu servisní list [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu servisní list [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Servicedocumentoperation posindex(Integer posindex) {
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

  public Servicedocumentoperation operationtext(String operationtext) {
    this.operationtext = operationtext;
    return this;
  }

   /**
   * operace textově [persistentní položka]
   * @return operationtext
  **/
  @ApiModelProperty(example = "null", value = "operace textově [persistentní položka]")
  public String getOperationtext() {
    return operationtext;
  }

  public void setOperationtext(String operationtext) {
    this.operationtext = operationtext;
  }

  public Servicedocumentoperation documentdefectId(String documentdefectId) {
    this.documentdefectId = documentdefectId;
    return this;
  }

   /**
   * závada; id objektu závada k serv.listu [persistentní položka]
   * @return documentdefectId
  **/
  @ApiModelProperty(example = "null", value = "závada; id objektu závada k serv.listu [persistentní položka]")
  public String getDocumentdefectId() {
    return documentdefectId;
  }

  public void setDocumentdefectId(String documentdefectId) {
    this.documentdefectId = documentdefectId;
  }

  public Servicedocumentoperation serviceoperationId(String serviceoperationId) {
    this.serviceoperationId = serviceoperationId;
    return this;
  }

   /**
   * operace; id objektu servisní operace [persistentní položka]
   * @return serviceoperationId
  **/
  @ApiModelProperty(example = "null", value = "operace; id objektu servisní operace [persistentní položka]")
  public String getServiceoperationId() {
    return serviceoperationId;
  }

  public void setServiceoperationId(String serviceoperationId) {
    this.serviceoperationId = serviceoperationId;
  }

  public Servicedocumentoperation quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * počet [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "počet [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Servicedocumentoperation workoperationtime(Double workoperationtime) {
    this.workoperationtime = workoperationtime;
    return this;
  }

   /**
   * pracovní čas
   * @return workoperationtime
  **/
  @ApiModelProperty(example = "null", value = "pracovní čas")
  public Double getWorkoperationtime() {
    return workoperationtime;
  }

  public void setWorkoperationtime(Double workoperationtime) {
    this.workoperationtime = workoperationtime;
  }

  public Servicedocumentoperation defectcode(String defectcode) {
    this.defectcode = defectcode;
    return this;
  }

   /**
   * k závadě
   * @return defectcode
  **/
  @ApiModelProperty(example = "null", value = "k závadě")
  public String getDefectcode() {
    return defectcode;
  }

  public void setDefectcode(String defectcode) {
    this.defectcode = defectcode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servicedocumentoperation servicedocumentoperation = (Servicedocumentoperation) o;
    return Objects.equals(this.displayname, servicedocumentoperation.displayname) &&
        Objects.equals(this.id, servicedocumentoperation.id) &&
        Objects.equals(this.classid, servicedocumentoperation.classid) &&
        Objects.equals(this.objversion, servicedocumentoperation.objversion) &&
        Objects.equals(this.parentId, servicedocumentoperation.parentId) &&
        Objects.equals(this.posindex, servicedocumentoperation.posindex) &&
        Objects.equals(this.operationtext, servicedocumentoperation.operationtext) &&
        Objects.equals(this.documentdefectId, servicedocumentoperation.documentdefectId) &&
        Objects.equals(this.serviceoperationId, servicedocumentoperation.serviceoperationId) &&
        Objects.equals(this.quantity, servicedocumentoperation.quantity) &&
        Objects.equals(this.workoperationtime, servicedocumentoperation.workoperationtime) &&
        Objects.equals(this.defectcode, servicedocumentoperation.defectcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, operationtext, documentdefectId, serviceoperationId, quantity, workoperationtime, defectcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servicedocumentoperation {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    operationtext: ").append(toIndentedString(operationtext)).append("\n");
    sb.append("    documentdefectId: ").append(toIndentedString(documentdefectId)).append("\n");
    sb.append("    serviceoperationId: ").append(toIndentedString(serviceoperationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    workoperationtime: ").append(toIndentedString(workoperationtime)).append("\n");
    sb.append("    defectcode: ").append(toIndentedString(defectcode)).append("\n");
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
