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
 * Plmworkplaceshifttype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Plmworkplaceshifttype   {
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

  @SerializedName("shifttype_id")
  private String shifttypeId = null;

  @SerializedName("inccapacitycoef")
  private Double inccapacitycoef = null;

  @SerializedName("inccapacityismulti")
  private Boolean inccapacityismulti = null;

  public Plmworkplaceshifttype displayname(String displayname) {
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

  public Plmworkplaceshifttype id(String id) {
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

  public Plmworkplaceshifttype classid(String classid) {
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

  public Plmworkplaceshifttype objversion(Integer objversion) {
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

  public Plmworkplaceshifttype parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu pracoviště a stroj [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu pracoviště a stroj [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Plmworkplaceshifttype posindex(Integer posindex) {
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

  public Plmworkplaceshifttype shifttypeId(String shifttypeId) {
    this.shifttypeId = shifttypeId;
    return this;
  }

   /**
   * druhy směn; id objektu druh pracovní směny [persistentní položka]
   * @return shifttypeId
  **/
  @ApiModelProperty(example = "null", value = "druhy směn; id objektu druh pracovní směny [persistentní položka]")
  public String getShifttypeId() {
    return shifttypeId;
  }

  public void setShifttypeId(String shifttypeId) {
    this.shifttypeId = shifttypeId;
  }

  public Plmworkplaceshifttype inccapacitycoef(Double inccapacitycoef) {
    this.inccapacitycoef = inccapacitycoef;
    return this;
  }

   /**
   * koeficient navýšení [persistentní položka]
   * @return inccapacitycoef
  **/
  @ApiModelProperty(example = "null", value = "koeficient navýšení [persistentní položka]")
  public Double getInccapacitycoef() {
    return inccapacitycoef;
  }

  public void setInccapacitycoef(Double inccapacitycoef) {
    this.inccapacitycoef = inccapacitycoef;
  }

  public Plmworkplaceshifttype inccapacityismulti(Boolean inccapacityismulti) {
    this.inccapacityismulti = inccapacityismulti;
    return this;
  }

   /**
   * způsob navýšení [persistentní položka]
   * @return inccapacityismulti
  **/
  @ApiModelProperty(example = "null", value = "způsob navýšení [persistentní položka]")
  public Boolean getInccapacityismulti() {
    return inccapacityismulti;
  }

  public void setInccapacityismulti(Boolean inccapacityismulti) {
    this.inccapacityismulti = inccapacityismulti;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmworkplaceshifttype plmworkplaceshifttype = (Plmworkplaceshifttype) o;
    return Objects.equals(this.displayname, plmworkplaceshifttype.displayname) &&
        Objects.equals(this.id, plmworkplaceshifttype.id) &&
        Objects.equals(this.classid, plmworkplaceshifttype.classid) &&
        Objects.equals(this.objversion, plmworkplaceshifttype.objversion) &&
        Objects.equals(this.parentId, plmworkplaceshifttype.parentId) &&
        Objects.equals(this.posindex, plmworkplaceshifttype.posindex) &&
        Objects.equals(this.shifttypeId, plmworkplaceshifttype.shifttypeId) &&
        Objects.equals(this.inccapacitycoef, plmworkplaceshifttype.inccapacitycoef) &&
        Objects.equals(this.inccapacityismulti, plmworkplaceshifttype.inccapacityismulti);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, shifttypeId, inccapacitycoef, inccapacityismulti);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmworkplaceshifttype {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    shifttypeId: ").append(toIndentedString(shifttypeId)).append("\n");
    sb.append("    inccapacitycoef: ").append(toIndentedString(inccapacitycoef)).append("\n");
    sb.append("    inccapacityismulti: ").append(toIndentedString(inccapacityismulti)).append("\n");
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

