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
 * Posvatindex
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Posvatindex   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("vatrate")
  private Double vatrate = null;

  @SerializedName("vatindex_id")
  private String vatindexId = null;

  @SerializedName("vatrate_id")
  private String vatrateId = null;

  @SerializedName("dutyfree")
  private Boolean dutyfree = null;

  public Posvatindex displayname(String displayname) {
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

  public Posvatindex id(String id) {
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

  public Posvatindex classid(String classid) {
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

  public Posvatindex objversion(Integer objversion) {
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

  public Posvatindex vatrate(Double vatrate) {
    this.vatrate = vatrate;
    return this;
  }

   /**
   * sazba dph [persistentní položka]
   * @return vatrate
  **/
  @ApiModelProperty(example = "null", value = "sazba dph [persistentní položka]")
  public Double getVatrate() {
    return vatrate;
  }

  public void setVatrate(Double vatrate) {
    this.vatrate = vatrate;
  }

  public Posvatindex vatindexId(String vatindexId) {
    this.vatindexId = vatindexId;
    return this;
  }

   /**
   * výstupní dph index; id objektu dph index [persistentní položka]
   * @return vatindexId
  **/
  @ApiModelProperty(example = "null", value = "výstupní dph index; id objektu dph index [persistentní položka]")
  public String getVatindexId() {
    return vatindexId;
  }

  public void setVatindexId(String vatindexId) {
    this.vatindexId = vatindexId;
  }

  public Posvatindex vatrateId(String vatrateId) {
    this.vatrateId = vatrateId;
    return this;
  }

   /**
   * %dph; id objektu dph sazba [persistentní položka]
   * @return vatrateId
  **/
  @ApiModelProperty(example = "null", value = "%dph; id objektu dph sazba [persistentní položka]")
  public String getVatrateId() {
    return vatrateId;
  }

  public void setVatrateId(String vatrateId) {
    this.vatrateId = vatrateId;
  }

  public Posvatindex dutyfree(Boolean dutyfree) {
    this.dutyfree = dutyfree;
    return this;
  }

   /**
   * dutyfree [persistentní položka]
   * @return dutyfree
  **/
  @ApiModelProperty(example = "null", value = "dutyfree [persistentní položka]")
  public Boolean getDutyfree() {
    return dutyfree;
  }

  public void setDutyfree(Boolean dutyfree) {
    this.dutyfree = dutyfree;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Posvatindex posvatindex = (Posvatindex) o;
    return Objects.equals(this.displayname, posvatindex.displayname) &&
        Objects.equals(this.id, posvatindex.id) &&
        Objects.equals(this.classid, posvatindex.classid) &&
        Objects.equals(this.objversion, posvatindex.objversion) &&
        Objects.equals(this.vatrate, posvatindex.vatrate) &&
        Objects.equals(this.vatindexId, posvatindex.vatindexId) &&
        Objects.equals(this.vatrateId, posvatindex.vatrateId) &&
        Objects.equals(this.dutyfree, posvatindex.dutyfree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, vatrate, vatindexId, vatrateId, dutyfree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Posvatindex {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    vatrate: ").append(toIndentedString(vatrate)).append("\n");
    sb.append("    vatindexId: ").append(toIndentedString(vatindexId)).append("\n");
    sb.append("    vatrateId: ").append(toIndentedString(vatrateId)).append("\n");
    sb.append("    dutyfree: ").append(toIndentedString(dutyfree)).append("\n");
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

