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
 * Plmoperationchange
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Plmoperationchange   {
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

  @SerializedName("transfer2_id")
  private String transfer2Id = null;

  @SerializedName("deltatotaltime")
  private Double deltatotaltime = null;

  public Plmoperationchange displayname(String displayname) {
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

  public Plmoperationchange id(String id) {
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

  public Plmoperationchange classid(String classid) {
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

  public Plmoperationchange objversion(Integer objversion) {
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

  public Plmoperationchange parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu pracovní lístek [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu pracovní lístek [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Plmoperationchange transfer2Id(String transfer2Id) {
    this.transfer2Id = transfer2Id;
    return this;
  }

   /**
   * Řádek přenosu do mezd [persistentní položka]
   * @return transfer2Id
  **/
  @ApiModelProperty(example = "null", value = "Řádek přenosu do mezd [persistentní položka]")
  public String getTransfer2Id() {
    return transfer2Id;
  }

  public void setTransfer2Id(String transfer2Id) {
    this.transfer2Id = transfer2Id;
  }

  public Plmoperationchange deltatotaltime(Double deltatotaltime) {
    this.deltatotaltime = deltatotaltime;
    return this;
  }

   /**
   * změna doby trvání [persistentní položka]
   * @return deltatotaltime
  **/
  @ApiModelProperty(example = "null", value = "změna doby trvání [persistentní položka]")
  public Double getDeltatotaltime() {
    return deltatotaltime;
  }

  public void setDeltatotaltime(Double deltatotaltime) {
    this.deltatotaltime = deltatotaltime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmoperationchange plmoperationchange = (Plmoperationchange) o;
    return Objects.equals(this.displayname, plmoperationchange.displayname) &&
        Objects.equals(this.id, plmoperationchange.id) &&
        Objects.equals(this.classid, plmoperationchange.classid) &&
        Objects.equals(this.objversion, plmoperationchange.objversion) &&
        Objects.equals(this.parentId, plmoperationchange.parentId) &&
        Objects.equals(this.transfer2Id, plmoperationchange.transfer2Id) &&
        Objects.equals(this.deltatotaltime, plmoperationchange.deltatotaltime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, transfer2Id, deltatotaltime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmoperationchange {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    transfer2Id: ").append(toIndentedString(transfer2Id)).append("\n");
    sb.append("    deltatotaltime: ").append(toIndentedString(deltatotaltime)).append("\n");
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
