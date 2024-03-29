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
 * Wlentrytype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Wlentrytype   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("basetype")
  private Integer basetype = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("unitcode")
  private String unitcode = null;

  @SerializedName("displaybutton")
  private Boolean displaybutton = null;

  @SerializedName("basetypeastext")
  private String basetypeastext = null;

  @SerializedName("color")
  private Integer color = null;

  @SerializedName("calculatesurchargefeasthours")
  private Boolean calculatesurchargefeasthours = null;

  @SerializedName("calculatesurchargenighthours")
  private Boolean calculatesurchargenighthours = null;

  @SerializedName("calculatesurchargeenvhours")
  private Boolean calculatesurchargeenvhours = null;

  @SerializedName("calculatesurchargewendhours")
  private Boolean calculatesurchargewendhours = null;

  public Wlentrytype displayname(String displayname) {
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

  public Wlentrytype id(String id) {
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

  public Wlentrytype classid(String classid) {
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

  public Wlentrytype objversion(Integer objversion) {
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

  public Wlentrytype basetype(Integer basetype) {
    this.basetype = basetype;
    return this;
  }

   /**
   * základní typ [persistentní položka]
   * @return basetype
  **/
  @ApiModelProperty(example = "null", value = "základní typ [persistentní položka]")
  public Integer getBasetype() {
    return basetype;
  }

  public void setBasetype(Integer basetype) {
    this.basetype = basetype;
  }

  public Wlentrytype code(String code) {
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

  public Wlentrytype name(String name) {
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

  public Wlentrytype unitcode(String unitcode) {
    this.unitcode = unitcode;
    return this;
  }

   /**
   * jednotka [persistentní položka]
   * @return unitcode
  **/
  @ApiModelProperty(example = "null", value = "jednotka [persistentní položka]")
  public String getUnitcode() {
    return unitcode;
  }

  public void setUnitcode(String unitcode) {
    this.unitcode = unitcode;
  }

  public Wlentrytype displaybutton(Boolean displaybutton) {
    this.displaybutton = displaybutton;
    return this;
  }

   /**
   * zobrazovat tlačítko rychlého zadání [persistentní položka]
   * @return displaybutton
  **/
  @ApiModelProperty(example = "null", value = "zobrazovat tlačítko rychlého zadání [persistentní položka]")
  public Boolean getDisplaybutton() {
    return displaybutton;
  }

  public void setDisplaybutton(Boolean displaybutton) {
    this.displaybutton = displaybutton;
  }

  public Wlentrytype basetypeastext(String basetypeastext) {
    this.basetypeastext = basetypeastext;
    return this;
  }

   /**
   * základní typ textově
   * @return basetypeastext
  **/
  @ApiModelProperty(example = "null", value = "základní typ textově")
  public String getBasetypeastext() {
    return basetypeastext;
  }

  public void setBasetypeastext(String basetypeastext) {
    this.basetypeastext = basetypeastext;
  }

  public Wlentrytype color(Integer color) {
    this.color = color;
    return this;
  }

   /**
   * barva [persistentní položka]
   * @return color
  **/
  @ApiModelProperty(example = "null", value = "barva [persistentní položka]")
  public Integer getColor() {
    return color;
  }

  public void setColor(Integer color) {
    this.color = color;
  }

  public Wlentrytype calculatesurchargefeasthours(Boolean calculatesurchargefeasthours) {
    this.calculatesurchargefeasthours = calculatesurchargefeasthours;
    return this;
  }

   /**
   * předvyplnit odpr. čas ve svátek [persistentní položka]
   * @return calculatesurchargefeasthours
  **/
  @ApiModelProperty(example = "null", value = "předvyplnit odpr. čas ve svátek [persistentní položka]")
  public Boolean getCalculatesurchargefeasthours() {
    return calculatesurchargefeasthours;
  }

  public void setCalculatesurchargefeasthours(Boolean calculatesurchargefeasthours) {
    this.calculatesurchargefeasthours = calculatesurchargefeasthours;
  }

  public Wlentrytype calculatesurchargenighthours(Boolean calculatesurchargenighthours) {
    this.calculatesurchargenighthours = calculatesurchargenighthours;
    return this;
  }

   /**
   * předvyplnit odpr. čas v noci [persistentní položka]
   * @return calculatesurchargenighthours
  **/
  @ApiModelProperty(example = "null", value = "předvyplnit odpr. čas v noci [persistentní položka]")
  public Boolean getCalculatesurchargenighthours() {
    return calculatesurchargenighthours;
  }

  public void setCalculatesurchargenighthours(Boolean calculatesurchargenighthours) {
    this.calculatesurchargenighthours = calculatesurchargenighthours;
  }

  public Wlentrytype calculatesurchargeenvhours(Boolean calculatesurchargeenvhours) {
    this.calculatesurchargeenvhours = calculatesurchargeenvhours;
    return this;
  }

   /**
   * předvyplnit odpr. čas ve šk. prostředí [persistentní položka]
   * @return calculatesurchargeenvhours
  **/
  @ApiModelProperty(example = "null", value = "předvyplnit odpr. čas ve šk. prostředí [persistentní položka]")
  public Boolean getCalculatesurchargeenvhours() {
    return calculatesurchargeenvhours;
  }

  public void setCalculatesurchargeenvhours(Boolean calculatesurchargeenvhours) {
    this.calculatesurchargeenvhours = calculatesurchargeenvhours;
  }

  public Wlentrytype calculatesurchargewendhours(Boolean calculatesurchargewendhours) {
    this.calculatesurchargewendhours = calculatesurchargewendhours;
    return this;
  }

   /**
   * předvyplnit odpr. čas v so/ne [persistentní položka]
   * @return calculatesurchargewendhours
  **/
  @ApiModelProperty(example = "null", value = "předvyplnit odpr. čas v so/ne [persistentní položka]")
  public Boolean getCalculatesurchargewendhours() {
    return calculatesurchargewendhours;
  }

  public void setCalculatesurchargewendhours(Boolean calculatesurchargewendhours) {
    this.calculatesurchargewendhours = calculatesurchargewendhours;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wlentrytype wlentrytype = (Wlentrytype) o;
    return Objects.equals(this.displayname, wlentrytype.displayname) &&
        Objects.equals(this.id, wlentrytype.id) &&
        Objects.equals(this.classid, wlentrytype.classid) &&
        Objects.equals(this.objversion, wlentrytype.objversion) &&
        Objects.equals(this.basetype, wlentrytype.basetype) &&
        Objects.equals(this.code, wlentrytype.code) &&
        Objects.equals(this.name, wlentrytype.name) &&
        Objects.equals(this.unitcode, wlentrytype.unitcode) &&
        Objects.equals(this.displaybutton, wlentrytype.displaybutton) &&
        Objects.equals(this.basetypeastext, wlentrytype.basetypeastext) &&
        Objects.equals(this.color, wlentrytype.color) &&
        Objects.equals(this.calculatesurchargefeasthours, wlentrytype.calculatesurchargefeasthours) &&
        Objects.equals(this.calculatesurchargenighthours, wlentrytype.calculatesurchargenighthours) &&
        Objects.equals(this.calculatesurchargeenvhours, wlentrytype.calculatesurchargeenvhours) &&
        Objects.equals(this.calculatesurchargewendhours, wlentrytype.calculatesurchargewendhours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, basetype, code, name, unitcode, displaybutton, basetypeastext, color, calculatesurchargefeasthours, calculatesurchargenighthours, calculatesurchargeenvhours, calculatesurchargewendhours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wlentrytype {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    basetype: ").append(toIndentedString(basetype)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unitcode: ").append(toIndentedString(unitcode)).append("\n");
    sb.append("    displaybutton: ").append(toIndentedString(displaybutton)).append("\n");
    sb.append("    basetypeastext: ").append(toIndentedString(basetypeastext)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    calculatesurchargefeasthours: ").append(toIndentedString(calculatesurchargefeasthours)).append("\n");
    sb.append("    calculatesurchargenighthours: ").append(toIndentedString(calculatesurchargenighthours)).append("\n");
    sb.append("    calculatesurchargeenvhours: ").append(toIndentedString(calculatesurchargeenvhours)).append("\n");
    sb.append("    calculatesurchargewendhours: ").append(toIndentedString(calculatesurchargewendhours)).append("\n");
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

