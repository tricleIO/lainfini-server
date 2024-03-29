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
 * Scmsetting
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Scmsetting   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("system")
  private Boolean system = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("displayformat")
  private String displayformat = null;

  @SerializedName("crisiscolor")
  private Integer crisiscolor = null;

  @SerializedName("tempcrisiscolor")
  private Integer tempcrisiscolor = null;

  @SerializedName("crisisfontcolor")
  private Integer crisisfontcolor = null;

  @SerializedName("tempcrisisfontcolor")
  private Integer tempcrisisfontcolor = null;

  @SerializedName("storecardssource_id")
  private String storecardssourceId = null;

  @SerializedName("storessource_id")
  private String storessourceId = null;

  public Scmsetting displayname(String displayname) {
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

  public Scmsetting id(String id) {
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

  public Scmsetting classid(String classid) {
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

  public Scmsetting objversion(Integer objversion) {
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

  public Scmsetting code(String code) {
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

  public Scmsetting name(String name) {
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

  public Scmsetting system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * systémové [persistentní položka]
   * @return system
  **/
  @ApiModelProperty(example = "null", value = "systémové [persistentní položka]")
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }

  public Scmsetting hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * skryté [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "skryté [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Scmsetting displayformat(String displayformat) {
    this.displayformat = displayformat;
    return this;
  }

   /**
   * zobrazovací maska [persistentní položka]
   * @return displayformat
  **/
  @ApiModelProperty(example = "null", value = "zobrazovací maska [persistentní položka]")
  public String getDisplayformat() {
    return displayformat;
  }

  public void setDisplayformat(String displayformat) {
    this.displayformat = displayformat;
  }

  public Scmsetting crisiscolor(Integer crisiscolor) {
    this.crisiscolor = crisiscolor;
    return this;
  }

   /**
   * barva krize [persistentní položka]
   * @return crisiscolor
  **/
  @ApiModelProperty(example = "null", value = "barva krize [persistentní položka]")
  public Integer getCrisiscolor() {
    return crisiscolor;
  }

  public void setCrisiscolor(Integer crisiscolor) {
    this.crisiscolor = crisiscolor;
  }

  public Scmsetting tempcrisiscolor(Integer tempcrisiscolor) {
    this.tempcrisiscolor = tempcrisiscolor;
    return this;
  }

   /**
   * barva dočasné krize [persistentní položka]
   * @return tempcrisiscolor
  **/
  @ApiModelProperty(example = "null", value = "barva dočasné krize [persistentní položka]")
  public Integer getTempcrisiscolor() {
    return tempcrisiscolor;
  }

  public void setTempcrisiscolor(Integer tempcrisiscolor) {
    this.tempcrisiscolor = tempcrisiscolor;
  }

  public Scmsetting crisisfontcolor(Integer crisisfontcolor) {
    this.crisisfontcolor = crisisfontcolor;
    return this;
  }

   /**
   * barva písma krize [persistentní položka]
   * @return crisisfontcolor
  **/
  @ApiModelProperty(example = "null", value = "barva písma krize [persistentní položka]")
  public Integer getCrisisfontcolor() {
    return crisisfontcolor;
  }

  public void setCrisisfontcolor(Integer crisisfontcolor) {
    this.crisisfontcolor = crisisfontcolor;
  }

  public Scmsetting tempcrisisfontcolor(Integer tempcrisisfontcolor) {
    this.tempcrisisfontcolor = tempcrisisfontcolor;
    return this;
  }

   /**
   * barva písma dočasné krize [persistentní položka]
   * @return tempcrisisfontcolor
  **/
  @ApiModelProperty(example = "null", value = "barva písma dočasné krize [persistentní položka]")
  public Integer getTempcrisisfontcolor() {
    return tempcrisisfontcolor;
  }

  public void setTempcrisisfontcolor(Integer tempcrisisfontcolor) {
    this.tempcrisisfontcolor = tempcrisisfontcolor;
  }

  public Scmsetting storecardssourceId(String storecardssourceId) {
    this.storecardssourceId = storecardssourceId;
    return this;
  }

   /**
   * zdroj skl. karet; id objektu datový zdroj [persistentní položka]
   * @return storecardssourceId
  **/
  @ApiModelProperty(example = "null", value = "zdroj skl. karet; id objektu datový zdroj [persistentní položka]")
  public String getStorecardssourceId() {
    return storecardssourceId;
  }

  public void setStorecardssourceId(String storecardssourceId) {
    this.storecardssourceId = storecardssourceId;
  }

  public Scmsetting storessourceId(String storessourceId) {
    this.storessourceId = storessourceId;
    return this;
  }

   /**
   * zdroj skladů; id objektu datový zdroj [persistentní položka]
   * @return storessourceId
  **/
  @ApiModelProperty(example = "null", value = "zdroj skladů; id objektu datový zdroj [persistentní položka]")
  public String getStoressourceId() {
    return storessourceId;
  }

  public void setStoressourceId(String storessourceId) {
    this.storessourceId = storessourceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scmsetting scmsetting = (Scmsetting) o;
    return Objects.equals(this.displayname, scmsetting.displayname) &&
        Objects.equals(this.id, scmsetting.id) &&
        Objects.equals(this.classid, scmsetting.classid) &&
        Objects.equals(this.objversion, scmsetting.objversion) &&
        Objects.equals(this.code, scmsetting.code) &&
        Objects.equals(this.name, scmsetting.name) &&
        Objects.equals(this.system, scmsetting.system) &&
        Objects.equals(this.hidden, scmsetting.hidden) &&
        Objects.equals(this.displayformat, scmsetting.displayformat) &&
        Objects.equals(this.crisiscolor, scmsetting.crisiscolor) &&
        Objects.equals(this.tempcrisiscolor, scmsetting.tempcrisiscolor) &&
        Objects.equals(this.crisisfontcolor, scmsetting.crisisfontcolor) &&
        Objects.equals(this.tempcrisisfontcolor, scmsetting.tempcrisisfontcolor) &&
        Objects.equals(this.storecardssourceId, scmsetting.storecardssourceId) &&
        Objects.equals(this.storessourceId, scmsetting.storessourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, code, name, system, hidden, displayformat, crisiscolor, tempcrisiscolor, crisisfontcolor, tempcrisisfontcolor, storecardssourceId, storessourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scmsetting {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    displayformat: ").append(toIndentedString(displayformat)).append("\n");
    sb.append("    crisiscolor: ").append(toIndentedString(crisiscolor)).append("\n");
    sb.append("    tempcrisiscolor: ").append(toIndentedString(tempcrisiscolor)).append("\n");
    sb.append("    crisisfontcolor: ").append(toIndentedString(crisisfontcolor)).append("\n");
    sb.append("    tempcrisisfontcolor: ").append(toIndentedString(tempcrisisfontcolor)).append("\n");
    sb.append("    storecardssourceId: ").append(toIndentedString(storecardssourceId)).append("\n");
    sb.append("    storessourceId: ").append(toIndentedString(storessourceId)).append("\n");
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

