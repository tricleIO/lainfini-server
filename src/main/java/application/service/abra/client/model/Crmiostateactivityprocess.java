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
 * Crmiostateactivityprocess
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Crmiostateactivityprocess   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("iostatetotype_id")
  private String iostatetotypeId = null;

  @SerializedName("activityprocess_id")
  private String activityprocessId = null;

  public Crmiostateactivityprocess displayname(String displayname) {
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

  public Crmiostateactivityprocess id(String id) {
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

  public Crmiostateactivityprocess classid(String classid) {
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

  public Crmiostateactivityprocess objversion(Integer objversion) {
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

  public Crmiostateactivityprocess iostatetotypeId(String iostatetotypeId) {
    this.iostatetotypeId = iostatetotypeId;
    return this;
  }

   /**
   * stav nabídky; id objektu typ nabídky - možný stav [persistentní položka]
   * @return iostatetotypeId
  **/
  @ApiModelProperty(example = "null", value = "stav nabídky; id objektu typ nabídky - možný stav [persistentní položka]")
  public String getIostatetotypeId() {
    return iostatetotypeId;
  }

  public void setIostatetotypeId(String iostatetotypeId) {
    this.iostatetotypeId = iostatetotypeId;
  }

  public Crmiostateactivityprocess activityprocessId(String activityprocessId) {
    this.activityprocessId = activityprocessId;
    return this;
  }

   /**
   * proces; id objektu proces aktivit [persistentní položka]
   * @return activityprocessId
  **/
  @ApiModelProperty(example = "null", value = "proces; id objektu proces aktivit [persistentní položka]")
  public String getActivityprocessId() {
    return activityprocessId;
  }

  public void setActivityprocessId(String activityprocessId) {
    this.activityprocessId = activityprocessId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Crmiostateactivityprocess crmiostateactivityprocess = (Crmiostateactivityprocess) o;
    return Objects.equals(this.displayname, crmiostateactivityprocess.displayname) &&
        Objects.equals(this.id, crmiostateactivityprocess.id) &&
        Objects.equals(this.classid, crmiostateactivityprocess.classid) &&
        Objects.equals(this.objversion, crmiostateactivityprocess.objversion) &&
        Objects.equals(this.iostatetotypeId, crmiostateactivityprocess.iostatetotypeId) &&
        Objects.equals(this.activityprocessId, crmiostateactivityprocess.activityprocessId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, iostatetotypeId, activityprocessId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Crmiostateactivityprocess {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    iostatetotypeId: ").append(toIndentedString(iostatetotypeId)).append("\n");
    sb.append("    activityprocessId: ").append(toIndentedString(activityprocessId)).append("\n");
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
