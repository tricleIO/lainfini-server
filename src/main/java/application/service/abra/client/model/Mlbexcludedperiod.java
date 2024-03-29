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
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Mlbexcludedperiod
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Mlbexcludedperiod   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("trmcar_id")
  private String trmcarId = null;

  @SerializedName("datefrom$date")
  private DateTime datefromdate = null;

  @SerializedName("dateto$date")
  private DateTime datetodate = null;

  @SerializedName("description")
  private String description = null;

  public Mlbexcludedperiod displayname(String displayname) {
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

  public Mlbexcludedperiod id(String id) {
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

  public Mlbexcludedperiod classid(String classid) {
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

  public Mlbexcludedperiod objversion(Integer objversion) {
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

  public Mlbexcludedperiod trmcarId(String trmcarId) {
    this.trmcarId = trmcarId;
    return this;
  }

   /**
   * vozidlo; id objektu vozidlo [persistentní položka]
   * @return trmcarId
  **/
  @ApiModelProperty(example = "null", value = "vozidlo; id objektu vozidlo [persistentní položka]")
  public String getTrmcarId() {
    return trmcarId;
  }

  public void setTrmcarId(String trmcarId) {
    this.trmcarId = trmcarId;
  }

  public Mlbexcludedperiod datefromdate(DateTime datefromdate) {
    this.datefromdate = datefromdate;
    return this;
  }

   /**
   * datum a čas od [persistentní položka]
   * @return datefromdate
  **/
  @ApiModelProperty(example = "null", value = "datum a čas od [persistentní položka]")
  public DateTime getDatefromdate() {
    return datefromdate;
  }

  public void setDatefromdate(DateTime datefromdate) {
    this.datefromdate = datefromdate;
  }

  public Mlbexcludedperiod datetodate(DateTime datetodate) {
    this.datetodate = datetodate;
    return this;
  }

   /**
   * datum a čas do [persistentní položka]
   * @return datetodate
  **/
  @ApiModelProperty(example = "null", value = "datum a čas do [persistentní položka]")
  public DateTime getDatetodate() {
    return datetodate;
  }

  public void setDatetodate(DateTime datetodate) {
    this.datetodate = datetodate;
  }

  public Mlbexcludedperiod description(String description) {
    this.description = description;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mlbexcludedperiod mlbexcludedperiod = (Mlbexcludedperiod) o;
    return Objects.equals(this.displayname, mlbexcludedperiod.displayname) &&
        Objects.equals(this.id, mlbexcludedperiod.id) &&
        Objects.equals(this.classid, mlbexcludedperiod.classid) &&
        Objects.equals(this.objversion, mlbexcludedperiod.objversion) &&
        Objects.equals(this.trmcarId, mlbexcludedperiod.trmcarId) &&
        Objects.equals(this.datefromdate, mlbexcludedperiod.datefromdate) &&
        Objects.equals(this.datetodate, mlbexcludedperiod.datetodate) &&
        Objects.equals(this.description, mlbexcludedperiod.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, trmcarId, datefromdate, datetodate, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mlbexcludedperiod {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    trmcarId: ").append(toIndentedString(trmcarId)).append("\n");
    sb.append("    datefromdate: ").append(toIndentedString(datefromdate)).append("\n");
    sb.append("    datetodate: ").append(toIndentedString(datetodate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

