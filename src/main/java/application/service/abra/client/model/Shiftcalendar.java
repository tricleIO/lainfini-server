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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Shiftcalendar
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Shiftcalendar   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Shiftcalendarrow> rows = new ArrayList<Shiftcalendarrow>();

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("shifts")
  private List<Shiftcalendarshift> shifts = new ArrayList<Shiftcalendarshift>();

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("duty")
  private Double duty = null;

  @SerializedName("begining$date")
  private DateTime beginingdate = null;

  public Shiftcalendar displayname(String displayname) {
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

  public Shiftcalendar id(String id) {
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

  public Shiftcalendar classid(String classid) {
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

  public Shiftcalendar objversion(Integer objversion) {
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

  public Shiftcalendar rows(List<Shiftcalendarrow> rows) {
    this.rows = rows;
    return this;
  }

  public Shiftcalendar addRowsItem(Shiftcalendarrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * kalendář; kolekce bo plánovaná směna [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "kalendář; kolekce bo plánovaná směna [nepersistentní položka]")
  public List<Shiftcalendarrow> getRows() {
    return rows;
  }

  public void setRows(List<Shiftcalendarrow> rows) {
    this.rows = rows;
  }

  public Shiftcalendar hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "skrytý [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Shiftcalendar shifts(List<Shiftcalendarshift> shifts) {
    this.shifts = shifts;
    return this;
  }

  public Shiftcalendar addShiftsItem(Shiftcalendarshift shiftsItem) {
    this.shifts.add(shiftsItem);
    return this;
  }

   /**
   * směny; kolekce bo pořadí směny [nepersistentní položka]
   * @return shifts
  **/
  @ApiModelProperty(example = "null", value = "směny; kolekce bo pořadí směny [nepersistentní položka]")
  public List<Shiftcalendarshift> getShifts() {
    return shifts;
  }

  public void setShifts(List<Shiftcalendarshift> shifts) {
    this.shifts = shifts;
  }

  public Shiftcalendar code(String code) {
    this.code = code;
    return this;
  }

   /**
   * kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Shiftcalendar name(String name) {
    this.name = name;
    return this;
  }

   /**
   * název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Shiftcalendar duty(Double duty) {
    this.duty = duty;
    return this;
  }

   /**
   * Úvazek [persistentní položka]
   * @return duty
  **/
  @ApiModelProperty(example = "null", value = "Úvazek [persistentní položka]")
  public Double getDuty() {
    return duty;
  }

  public void setDuty(Double duty) {
    this.duty = duty;
  }

  public Shiftcalendar beginingdate(DateTime beginingdate) {
    this.beginingdate = beginingdate;
    return this;
  }

   /**
   * první den [persistentní položka]
   * @return beginingdate
  **/
  @ApiModelProperty(example = "null", value = "první den [persistentní položka]")
  public DateTime getBeginingdate() {
    return beginingdate;
  }

  public void setBeginingdate(DateTime beginingdate) {
    this.beginingdate = beginingdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shiftcalendar shiftcalendar = (Shiftcalendar) o;
    return Objects.equals(this.displayname, shiftcalendar.displayname) &&
        Objects.equals(this.id, shiftcalendar.id) &&
        Objects.equals(this.classid, shiftcalendar.classid) &&
        Objects.equals(this.objversion, shiftcalendar.objversion) &&
        Objects.equals(this.rows, shiftcalendar.rows) &&
        Objects.equals(this.hidden, shiftcalendar.hidden) &&
        Objects.equals(this.shifts, shiftcalendar.shifts) &&
        Objects.equals(this.code, shiftcalendar.code) &&
        Objects.equals(this.name, shiftcalendar.name) &&
        Objects.equals(this.duty, shiftcalendar.duty) &&
        Objects.equals(this.beginingdate, shiftcalendar.beginingdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, hidden, shifts, code, name, duty, beginingdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shiftcalendar {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    shifts: ").append(toIndentedString(shifts)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    duty: ").append(toIndentedString(duty)).append("\n");
    sb.append("    beginingdate: ").append(toIndentedString(beginingdate)).append("\n");
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

