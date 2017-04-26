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
 * Storecardmenuitemlink
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Storecardmenuitemlink   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("storemenuitem_id")
  private String storemenuitemId = null;

  @SerializedName("isbasiclink")
  private Boolean isbasiclink = null;

  public Storecardmenuitemlink displayname(String displayname) {
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

  public Storecardmenuitemlink id(String id) {
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

  public Storecardmenuitemlink classid(String classid) {
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

  public Storecardmenuitemlink objversion(Integer objversion) {
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

  public Storecardmenuitemlink storecardId(String storecardId) {
    this.storecardId = storecardId;
    return this;
  }

   /**
   * skladová karta; id objektu skladová karta [persistentní položka]
   * @return storecardId
  **/
  @ApiModelProperty(example = "null", value = "skladová karta; id objektu skladová karta [persistentní položka]")
  public String getStorecardId() {
    return storecardId;
  }

  public void setStorecardId(String storecardId) {
    this.storecardId = storecardId;
  }

  public Storecardmenuitemlink storemenuitemId(String storemenuitemId) {
    this.storemenuitemId = storemenuitemId;
    return this;
  }

   /**
   * skladové menu; id objektu skladové menu [persistentní položka]
   * @return storemenuitemId
  **/
  @ApiModelProperty(example = "null", value = "skladové menu; id objektu skladové menu [persistentní položka]")
  public String getStoremenuitemId() {
    return storemenuitemId;
  }

  public void setStoremenuitemId(String storemenuitemId) {
    this.storemenuitemId = storemenuitemId;
  }

  public Storecardmenuitemlink isbasiclink(Boolean isbasiclink) {
    this.isbasiclink = isbasiclink;
    return this;
  }

   /**
   * výchozí
   * @return isbasiclink
  **/
  @ApiModelProperty(example = "null", value = "výchozí")
  public Boolean getIsbasiclink() {
    return isbasiclink;
  }

  public void setIsbasiclink(Boolean isbasiclink) {
    this.isbasiclink = isbasiclink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Storecardmenuitemlink storecardmenuitemlink = (Storecardmenuitemlink) o;
    return Objects.equals(this.displayname, storecardmenuitemlink.displayname) &&
        Objects.equals(this.id, storecardmenuitemlink.id) &&
        Objects.equals(this.classid, storecardmenuitemlink.classid) &&
        Objects.equals(this.objversion, storecardmenuitemlink.objversion) &&
        Objects.equals(this.storecardId, storecardmenuitemlink.storecardId) &&
        Objects.equals(this.storemenuitemId, storecardmenuitemlink.storemenuitemId) &&
        Objects.equals(this.isbasiclink, storecardmenuitemlink.isbasiclink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, storecardId, storemenuitemId, isbasiclink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Storecardmenuitemlink {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    storemenuitemId: ").append(toIndentedString(storemenuitemId)).append("\n");
    sb.append("    isbasiclink: ").append(toIndentedString(isbasiclink)).append("\n");
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

