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
 * Dealerturnoverdefinitionrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Dealerturnoverdefinitionrow   {
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

  @SerializedName("amountlimit")
  private Double amountlimit = null;

  @SerializedName("dealercategory_id")
  private String dealercategoryId = null;

  public Dealerturnoverdefinitionrow displayname(String displayname) {
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

  public Dealerturnoverdefinitionrow id(String id) {
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

  public Dealerturnoverdefinitionrow classid(String classid) {
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

  public Dealerturnoverdefinitionrow objversion(Integer objversion) {
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

  public Dealerturnoverdefinitionrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu tabulka obratů dealerských skupin [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu tabulka obratů dealerských skupin [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Dealerturnoverdefinitionrow amountlimit(Double amountlimit) {
    this.amountlimit = amountlimit;
    return this;
  }

   /**
   * min.částka [persistentní položka]
   * @return amountlimit
  **/
  @ApiModelProperty(example = "null", value = "min.částka [persistentní položka]")
  public Double getAmountlimit() {
    return amountlimit;
  }

  public void setAmountlimit(Double amountlimit) {
    this.amountlimit = amountlimit;
  }

  public Dealerturnoverdefinitionrow dealercategoryId(String dealercategoryId) {
    this.dealercategoryId = dealercategoryId;
    return this;
  }

   /**
   * deal.třída; id objektu dealerská třída [persistentní položka]
   * @return dealercategoryId
  **/
  @ApiModelProperty(example = "null", value = "deal.třída; id objektu dealerská třída [persistentní položka]")
  public String getDealercategoryId() {
    return dealercategoryId;
  }

  public void setDealercategoryId(String dealercategoryId) {
    this.dealercategoryId = dealercategoryId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dealerturnoverdefinitionrow dealerturnoverdefinitionrow = (Dealerturnoverdefinitionrow) o;
    return Objects.equals(this.displayname, dealerturnoverdefinitionrow.displayname) &&
        Objects.equals(this.id, dealerturnoverdefinitionrow.id) &&
        Objects.equals(this.classid, dealerturnoverdefinitionrow.classid) &&
        Objects.equals(this.objversion, dealerturnoverdefinitionrow.objversion) &&
        Objects.equals(this.parentId, dealerturnoverdefinitionrow.parentId) &&
        Objects.equals(this.amountlimit, dealerturnoverdefinitionrow.amountlimit) &&
        Objects.equals(this.dealercategoryId, dealerturnoverdefinitionrow.dealercategoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, amountlimit, dealercategoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dealerturnoverdefinitionrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    amountlimit: ").append(toIndentedString(amountlimit)).append("\n");
    sb.append("    dealercategoryId: ").append(toIndentedString(dealercategoryId)).append("\n");
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

