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
 * Servicedocumentdefect
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Servicedocumentdefect   {
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

  @SerializedName("defecttext")
  private String defecttext = null;

  @SerializedName("servicedefect_id")
  private String servicedefectId = null;

  @SerializedName("estimatedpricewithoutvat")
  private Double estimatedpricewithoutvat = null;

  @SerializedName("estimatedprice")
  private Double estimatedprice = null;

  @SerializedName("charged")
  private Boolean charged = null;

  public Servicedocumentdefect displayname(String displayname) {
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

  public Servicedocumentdefect id(String id) {
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

  public Servicedocumentdefect classid(String classid) {
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

  public Servicedocumentdefect objversion(Integer objversion) {
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

  public Servicedocumentdefect parentId(String parentId) {
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

  public Servicedocumentdefect posindex(Integer posindex) {
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

  public Servicedocumentdefect defecttext(String defecttext) {
    this.defecttext = defecttext;
    return this;
  }

   /**
   * závada textově [persistentní položka]
   * @return defecttext
  **/
  @ApiModelProperty(example = "null", value = "závada textově [persistentní položka]")
  public String getDefecttext() {
    return defecttext;
  }

  public void setDefecttext(String defecttext) {
    this.defecttext = defecttext;
  }

  public Servicedocumentdefect servicedefectId(String servicedefectId) {
    this.servicedefectId = servicedefectId;
    return this;
  }

   /**
   * závada; id objektu servisní závada [persistentní položka]
   * @return servicedefectId
  **/
  @ApiModelProperty(example = "null", value = "závada; id objektu servisní závada [persistentní položka]")
  public String getServicedefectId() {
    return servicedefectId;
  }

  public void setServicedefectId(String servicedefectId) {
    this.servicedefectId = servicedefectId;
  }

  public Servicedocumentdefect estimatedpricewithoutvat(Double estimatedpricewithoutvat) {
    this.estimatedpricewithoutvat = estimatedpricewithoutvat;
    return this;
  }

   /**
   * odhadovaná cena bez daně [persistentní položka]
   * @return estimatedpricewithoutvat
  **/
  @ApiModelProperty(example = "null", value = "odhadovaná cena bez daně [persistentní položka]")
  public Double getEstimatedpricewithoutvat() {
    return estimatedpricewithoutvat;
  }

  public void setEstimatedpricewithoutvat(Double estimatedpricewithoutvat) {
    this.estimatedpricewithoutvat = estimatedpricewithoutvat;
  }

  public Servicedocumentdefect estimatedprice(Double estimatedprice) {
    this.estimatedprice = estimatedprice;
    return this;
  }

   /**
   * odhadovaná cena s daní [persistentní položka]
   * @return estimatedprice
  **/
  @ApiModelProperty(example = "null", value = "odhadovaná cena s daní [persistentní položka]")
  public Double getEstimatedprice() {
    return estimatedprice;
  }

  public void setEstimatedprice(Double estimatedprice) {
    this.estimatedprice = estimatedprice;
  }

  public Servicedocumentdefect charged(Boolean charged) {
    this.charged = charged;
    return this;
  }

   /**
   * placená [persistentní položka]
   * @return charged
  **/
  @ApiModelProperty(example = "null", value = "placená [persistentní položka]")
  public Boolean getCharged() {
    return charged;
  }

  public void setCharged(Boolean charged) {
    this.charged = charged;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Servicedocumentdefect servicedocumentdefect = (Servicedocumentdefect) o;
    return Objects.equals(this.displayname, servicedocumentdefect.displayname) &&
        Objects.equals(this.id, servicedocumentdefect.id) &&
        Objects.equals(this.classid, servicedocumentdefect.classid) &&
        Objects.equals(this.objversion, servicedocumentdefect.objversion) &&
        Objects.equals(this.parentId, servicedocumentdefect.parentId) &&
        Objects.equals(this.posindex, servicedocumentdefect.posindex) &&
        Objects.equals(this.defecttext, servicedocumentdefect.defecttext) &&
        Objects.equals(this.servicedefectId, servicedocumentdefect.servicedefectId) &&
        Objects.equals(this.estimatedpricewithoutvat, servicedocumentdefect.estimatedpricewithoutvat) &&
        Objects.equals(this.estimatedprice, servicedocumentdefect.estimatedprice) &&
        Objects.equals(this.charged, servicedocumentdefect.charged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, defecttext, servicedefectId, estimatedpricewithoutvat, estimatedprice, charged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Servicedocumentdefect {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    defecttext: ").append(toIndentedString(defecttext)).append("\n");
    sb.append("    servicedefectId: ").append(toIndentedString(servicedefectId)).append("\n");
    sb.append("    estimatedpricewithoutvat: ").append(toIndentedString(estimatedpricewithoutvat)).append("\n");
    sb.append("    estimatedprice: ").append(toIndentedString(estimatedprice)).append("\n");
    sb.append("    charged: ").append(toIndentedString(charged)).append("\n");
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

