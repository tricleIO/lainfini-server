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
 * Execcalcchartscript
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Execcalcchartscript   {
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

  @SerializedName("scriptbefore")
  private String scriptbefore = null;

  @SerializedName("scriptafter")
  private String scriptafter = null;

  @SerializedName("validfrom$date")
  private DateTime validfromdate = null;

  @SerializedName("system")
  private Boolean system = null;

  @SerializedName("explanation")
  private String explanation = null;

  @SerializedName("userscriptbefore")
  private String userscriptbefore = null;

  @SerializedName("userscriptafter")
  private String userscriptafter = null;

  @SerializedName("userexplanation")
  private String userexplanation = null;

  @SerializedName("supressscriptbefore")
  private Integer supressscriptbefore = null;

  @SerializedName("supressscriptafter")
  private Integer supressscriptafter = null;

  @SerializedName("supressscriptbeforetext")
  private String supressscriptbeforetext = null;

  @SerializedName("supressscriptaftertext")
  private String supressscriptaftertext = null;

  public Execcalcchartscript displayname(String displayname) {
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

  public Execcalcchartscript id(String id) {
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

  public Execcalcchartscript classid(String classid) {
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

  public Execcalcchartscript objversion(Integer objversion) {
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

  public Execcalcchartscript parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu výpočtové schéma [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu výpočtové schéma [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Execcalcchartscript scriptbefore(String scriptbefore) {
    this.scriptbefore = scriptbefore;
    return this;
  }

   /**
   * skript před [persistentní položka]
   * @return scriptbefore
  **/
  @ApiModelProperty(example = "null", value = "skript před [persistentní položka]")
  public String getScriptbefore() {
    return scriptbefore;
  }

  public void setScriptbefore(String scriptbefore) {
    this.scriptbefore = scriptbefore;
  }

  public Execcalcchartscript scriptafter(String scriptafter) {
    this.scriptafter = scriptafter;
    return this;
  }

   /**
   * skript po [persistentní položka]
   * @return scriptafter
  **/
  @ApiModelProperty(example = "null", value = "skript po [persistentní položka]")
  public String getScriptafter() {
    return scriptafter;
  }

  public void setScriptafter(String scriptafter) {
    this.scriptafter = scriptafter;
  }

  public Execcalcchartscript validfromdate(DateTime validfromdate) {
    this.validfromdate = validfromdate;
    return this;
  }

   /**
   * platí od [persistentní položka]
   * @return validfromdate
  **/
  @ApiModelProperty(example = "null", value = "platí od [persistentní položka]")
  public DateTime getValidfromdate() {
    return validfromdate;
  }

  public void setValidfromdate(DateTime validfromdate) {
    this.validfromdate = validfromdate;
  }

  public Execcalcchartscript system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * syst. definice [persistentní položka]
   * @return system
  **/
  @ApiModelProperty(example = "null", value = "syst. definice [persistentní položka]")
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }

  public Execcalcchartscript explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

   /**
   * vysvětlení [persistentní položka]
   * @return explanation
  **/
  @ApiModelProperty(example = "null", value = "vysvětlení [persistentní položka]")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public Execcalcchartscript userscriptbefore(String userscriptbefore) {
    this.userscriptbefore = userscriptbefore;
    return this;
  }

   /**
   * uživ. skript před
   * @return userscriptbefore
  **/
  @ApiModelProperty(example = "null", value = "uživ. skript před")
  public String getUserscriptbefore() {
    return userscriptbefore;
  }

  public void setUserscriptbefore(String userscriptbefore) {
    this.userscriptbefore = userscriptbefore;
  }

  public Execcalcchartscript userscriptafter(String userscriptafter) {
    this.userscriptafter = userscriptafter;
    return this;
  }

   /**
   * uživ. skript po
   * @return userscriptafter
  **/
  @ApiModelProperty(example = "null", value = "uživ. skript po")
  public String getUserscriptafter() {
    return userscriptafter;
  }

  public void setUserscriptafter(String userscriptafter) {
    this.userscriptafter = userscriptafter;
  }

  public Execcalcchartscript userexplanation(String userexplanation) {
    this.userexplanation = userexplanation;
    return this;
  }

   /**
   * uživ. vysvětlení
   * @return userexplanation
  **/
  @ApiModelProperty(example = "null", value = "uživ. vysvětlení")
  public String getUserexplanation() {
    return userexplanation;
  }

  public void setUserexplanation(String userexplanation) {
    this.userexplanation = userexplanation;
  }

  public Execcalcchartscript supressscriptbefore(Integer supressscriptbefore) {
    this.supressscriptbefore = supressscriptbefore;
    return this;
  }

   /**
   * použít skript před
   * @return supressscriptbefore
  **/
  @ApiModelProperty(example = "null", value = "použít skript před")
  public Integer getSupressscriptbefore() {
    return supressscriptbefore;
  }

  public void setSupressscriptbefore(Integer supressscriptbefore) {
    this.supressscriptbefore = supressscriptbefore;
  }

  public Execcalcchartscript supressscriptafter(Integer supressscriptafter) {
    this.supressscriptafter = supressscriptafter;
    return this;
  }

   /**
   * použít skript po
   * @return supressscriptafter
  **/
  @ApiModelProperty(example = "null", value = "použít skript po")
  public Integer getSupressscriptafter() {
    return supressscriptafter;
  }

  public void setSupressscriptafter(Integer supressscriptafter) {
    this.supressscriptafter = supressscriptafter;
  }

  public Execcalcchartscript supressscriptbeforetext(String supressscriptbeforetext) {
    this.supressscriptbeforetext = supressscriptbeforetext;
    return this;
  }

   /**
   * použít skript před
   * @return supressscriptbeforetext
  **/
  @ApiModelProperty(example = "null", value = "použít skript před")
  public String getSupressscriptbeforetext() {
    return supressscriptbeforetext;
  }

  public void setSupressscriptbeforetext(String supressscriptbeforetext) {
    this.supressscriptbeforetext = supressscriptbeforetext;
  }

  public Execcalcchartscript supressscriptaftertext(String supressscriptaftertext) {
    this.supressscriptaftertext = supressscriptaftertext;
    return this;
  }

   /**
   * použít skript po
   * @return supressscriptaftertext
  **/
  @ApiModelProperty(example = "null", value = "použít skript po")
  public String getSupressscriptaftertext() {
    return supressscriptaftertext;
  }

  public void setSupressscriptaftertext(String supressscriptaftertext) {
    this.supressscriptaftertext = supressscriptaftertext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Execcalcchartscript execcalcchartscript = (Execcalcchartscript) o;
    return Objects.equals(this.displayname, execcalcchartscript.displayname) &&
        Objects.equals(this.id, execcalcchartscript.id) &&
        Objects.equals(this.classid, execcalcchartscript.classid) &&
        Objects.equals(this.objversion, execcalcchartscript.objversion) &&
        Objects.equals(this.parentId, execcalcchartscript.parentId) &&
        Objects.equals(this.scriptbefore, execcalcchartscript.scriptbefore) &&
        Objects.equals(this.scriptafter, execcalcchartscript.scriptafter) &&
        Objects.equals(this.validfromdate, execcalcchartscript.validfromdate) &&
        Objects.equals(this.system, execcalcchartscript.system) &&
        Objects.equals(this.explanation, execcalcchartscript.explanation) &&
        Objects.equals(this.userscriptbefore, execcalcchartscript.userscriptbefore) &&
        Objects.equals(this.userscriptafter, execcalcchartscript.userscriptafter) &&
        Objects.equals(this.userexplanation, execcalcchartscript.userexplanation) &&
        Objects.equals(this.supressscriptbefore, execcalcchartscript.supressscriptbefore) &&
        Objects.equals(this.supressscriptafter, execcalcchartscript.supressscriptafter) &&
        Objects.equals(this.supressscriptbeforetext, execcalcchartscript.supressscriptbeforetext) &&
        Objects.equals(this.supressscriptaftertext, execcalcchartscript.supressscriptaftertext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, scriptbefore, scriptafter, validfromdate, system, explanation, userscriptbefore, userscriptafter, userexplanation, supressscriptbefore, supressscriptafter, supressscriptbeforetext, supressscriptaftertext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Execcalcchartscript {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    scriptbefore: ").append(toIndentedString(scriptbefore)).append("\n");
    sb.append("    scriptafter: ").append(toIndentedString(scriptafter)).append("\n");
    sb.append("    validfromdate: ").append(toIndentedString(validfromdate)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    userscriptbefore: ").append(toIndentedString(userscriptbefore)).append("\n");
    sb.append("    userscriptafter: ").append(toIndentedString(userscriptafter)).append("\n");
    sb.append("    userexplanation: ").append(toIndentedString(userexplanation)).append("\n");
    sb.append("    supressscriptbefore: ").append(toIndentedString(supressscriptbefore)).append("\n");
    sb.append("    supressscriptafter: ").append(toIndentedString(supressscriptafter)).append("\n");
    sb.append("    supressscriptbeforetext: ").append(toIndentedString(supressscriptbeforetext)).append("\n");
    sb.append("    supressscriptaftertext: ").append(toIndentedString(supressscriptaftertext)).append("\n");
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

