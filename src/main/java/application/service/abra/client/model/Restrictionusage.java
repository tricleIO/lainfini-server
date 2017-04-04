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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Restrictionusage
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Restrictionusage   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Notpositionedrowbusinessobject> rows = new ArrayList<Notpositionedrowbusinessobject>();

  @SerializedName("restrictiondefinition_id")
  private String restrictiondefinitionId = null;

  @SerializedName("site")
  private String site = null;

  @SerializedName("programpoint")
  private String programpoint = null;

  @SerializedName("kind")
  private Integer kind = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("monthofuse")
  private Integer monthofuse = null;

  @SerializedName("yearofuse")
  private Integer yearofuse = null;

  @SerializedName("numberofuse")
  private Integer numberofuse = null;

  public Restrictionusage displayname(String displayname) {
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

  public Restrictionusage id(String id) {
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

  public Restrictionusage classid(String classid) {
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

  public Restrictionusage objversion(Integer objversion) {
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

  public Restrictionusage rows(List<Notpositionedrowbusinessobject> rows) {
    this.rows = rows;
    return this;
  }

  public Restrictionusage addRowsItem(Notpositionedrowbusinessobject rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo Řádek bez pořadí [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo Řádek bez pořadí [nepersistentní položka]")
  public List<Notpositionedrowbusinessobject> getRows() {
    return rows;
  }

  public void setRows(List<Notpositionedrowbusinessobject> rows) {
    this.rows = rows;
  }

  public Restrictionusage restrictiondefinitionId(String restrictiondefinitionId) {
    this.restrictiondefinitionId = restrictiondefinitionId;
    return this;
  }

   /**
   * definice omezení; id objektu definice omezení [persistentní položka]
   * @return restrictiondefinitionId
  **/
  @ApiModelProperty(example = "null", value = "definice omezení; id objektu definice omezení [persistentní položka]")
  public String getRestrictiondefinitionId() {
    return restrictiondefinitionId;
  }

  public void setRestrictiondefinitionId(String restrictiondefinitionId) {
    this.restrictiondefinitionId = restrictiondefinitionId;
  }

  public Restrictionusage site(String site) {
    this.site = site;
    return this;
  }

   /**
   * hnízdo [persistentní položka]
   * @return site
  **/
  @ApiModelProperty(example = "null", value = "hnízdo [persistentní položka]")
  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public Restrictionusage programpoint(String programpoint) {
    this.programpoint = programpoint;
    return this;
  }

   /**
   * místo v programu (program point) [persistentní položka]
   * @return programpoint
  **/
  @ApiModelProperty(example = "null", value = "místo v programu (program point) [persistentní položka]")
  public String getProgrampoint() {
    return programpoint;
  }

  public void setProgrampoint(String programpoint) {
    this.programpoint = programpoint;
  }

  public Restrictionusage kind(Integer kind) {
    this.kind = kind;
    return this;
  }

   /**
   * druh [persistentní položka]
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "druh [persistentní položka]")
  public Integer getKind() {
    return kind;
  }

  public void setKind(Integer kind) {
    this.kind = kind;
  }

  public Restrictionusage userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * uživatel; id objektu uživatel [persistentní položka]
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "uživatel; id objektu uživatel [persistentní položka]")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Restrictionusage monthofuse(Integer monthofuse) {
    this.monthofuse = monthofuse;
    return this;
  }

   /**
   * měsíc použití [persistentní položka]
   * @return monthofuse
  **/
  @ApiModelProperty(example = "null", value = "měsíc použití [persistentní položka]")
  public Integer getMonthofuse() {
    return monthofuse;
  }

  public void setMonthofuse(Integer monthofuse) {
    this.monthofuse = monthofuse;
  }

  public Restrictionusage yearofuse(Integer yearofuse) {
    this.yearofuse = yearofuse;
    return this;
  }

   /**
   * rok použití [persistentní položka]
   * @return yearofuse
  **/
  @ApiModelProperty(example = "null", value = "rok použití [persistentní položka]")
  public Integer getYearofuse() {
    return yearofuse;
  }

  public void setYearofuse(Integer yearofuse) {
    this.yearofuse = yearofuse;
  }

  public Restrictionusage numberofuse(Integer numberofuse) {
    this.numberofuse = numberofuse;
    return this;
  }

   /**
   * počet použití [persistentní položka]
   * @return numberofuse
  **/
  @ApiModelProperty(example = "null", value = "počet použití [persistentní položka]")
  public Integer getNumberofuse() {
    return numberofuse;
  }

  public void setNumberofuse(Integer numberofuse) {
    this.numberofuse = numberofuse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Restrictionusage restrictionusage = (Restrictionusage) o;
    return Objects.equals(this.displayname, restrictionusage.displayname) &&
        Objects.equals(this.id, restrictionusage.id) &&
        Objects.equals(this.classid, restrictionusage.classid) &&
        Objects.equals(this.objversion, restrictionusage.objversion) &&
        Objects.equals(this.rows, restrictionusage.rows) &&
        Objects.equals(this.restrictiondefinitionId, restrictionusage.restrictiondefinitionId) &&
        Objects.equals(this.site, restrictionusage.site) &&
        Objects.equals(this.programpoint, restrictionusage.programpoint) &&
        Objects.equals(this.kind, restrictionusage.kind) &&
        Objects.equals(this.userId, restrictionusage.userId) &&
        Objects.equals(this.monthofuse, restrictionusage.monthofuse) &&
        Objects.equals(this.yearofuse, restrictionusage.yearofuse) &&
        Objects.equals(this.numberofuse, restrictionusage.numberofuse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, restrictiondefinitionId, site, programpoint, kind, userId, monthofuse, yearofuse, numberofuse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restrictionusage {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    restrictiondefinitionId: ").append(toIndentedString(restrictiondefinitionId)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    programpoint: ").append(toIndentedString(programpoint)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    monthofuse: ").append(toIndentedString(monthofuse)).append("\n");
    sb.append("    yearofuse: ").append(toIndentedString(yearofuse)).append("\n");
    sb.append("    numberofuse: ").append(toIndentedString(numberofuse)).append("\n");
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
