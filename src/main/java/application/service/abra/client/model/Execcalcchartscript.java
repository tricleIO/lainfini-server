/**
 * ABRA Gen Web API (spojení testapi)
 * Webové API systému 17.03.03
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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Execcalcchartscript   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("ScriptBefore")
  private String scriptBefore = null;

  @SerializedName("ScriptAfter")
  private String scriptAfter = null;

  @SerializedName("ValidFrom$DATE")
  private DateTime validFromDATE = null;

  @SerializedName("System")
  private Boolean system = null;

  @SerializedName("Explanation")
  private String explanation = null;

  @SerializedName("UserScriptBefore")
  private String userScriptBefore = null;

  @SerializedName("UserScriptAfter")
  private String userScriptAfter = null;

  @SerializedName("UserExplanation")
  private String userExplanation = null;

  @SerializedName("SupressScriptBefore")
  private Integer supressScriptBefore = null;

  @SerializedName("SupressScriptAfter")
  private Integer supressScriptAfter = null;

  @SerializedName("SupressScriptBeforeText")
  private String supressScriptBeforeText = null;

  @SerializedName("SupressScriptAfterText")
  private String supressScriptAfterText = null;

   /**
   * Název
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Název")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Vlastní ID [persistentní položka]
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "Vlastní ID [persistentní položka]")
  public String getID() {
    return ID;
  }

   /**
   * ID třídy
   * @return classID
  **/
  @ApiModelProperty(example = "null", value = "ID třídy")
  public String getClassID() {
    return classID;
  }

   /**
   * Verze objektu [persistentní položka]
   * @return objVersion
  **/
  @ApiModelProperty(example = "null", value = "Verze objektu [persistentní položka]")
  public Integer getObjVersion() {
    return objVersion;
  }

   /**
   * Vlastník; ID objektu Výpočtové schéma [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Výpočtové schéma [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Execcalcchartscript scriptBefore(String scriptBefore) {
    this.scriptBefore = scriptBefore;
    return this;
  }

   /**
   * Skript před [persistentní položka]
   * @return scriptBefore
  **/
  @ApiModelProperty(example = "null", value = "Skript před [persistentní položka]")
  public String getScriptBefore() {
    return scriptBefore;
  }

  public void setScriptBefore(String scriptBefore) {
    this.scriptBefore = scriptBefore;
  }

  public Execcalcchartscript scriptAfter(String scriptAfter) {
    this.scriptAfter = scriptAfter;
    return this;
  }

   /**
   * Skript po [persistentní položka]
   * @return scriptAfter
  **/
  @ApiModelProperty(example = "null", value = "Skript po [persistentní položka]")
  public String getScriptAfter() {
    return scriptAfter;
  }

  public void setScriptAfter(String scriptAfter) {
    this.scriptAfter = scriptAfter;
  }

  public Execcalcchartscript validFromDATE(DateTime validFromDATE) {
    this.validFromDATE = validFromDATE;
    return this;
  }

   /**
   * Platí od [persistentní položka]
   * @return validFromDATE
  **/
  @ApiModelProperty(example = "null", value = "Platí od [persistentní položka]")
  public DateTime getValidFromDATE() {
    return validFromDATE;
  }

  public void setValidFromDATE(DateTime validFromDATE) {
    this.validFromDATE = validFromDATE;
  }

  public Execcalcchartscript system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * Syst. definice [persistentní položka]
   * @return system
  **/
  @ApiModelProperty(example = "null", value = "Syst. definice [persistentní položka]")
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
   * Vysvětlení [persistentní položka]
   * @return explanation
  **/
  @ApiModelProperty(example = "null", value = "Vysvětlení [persistentní položka]")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public Execcalcchartscript userScriptBefore(String userScriptBefore) {
    this.userScriptBefore = userScriptBefore;
    return this;
  }

   /**
   * Uživ. skript před
   * @return userScriptBefore
  **/
  @ApiModelProperty(example = "null", value = "Uživ. skript před")
  public String getUserScriptBefore() {
    return userScriptBefore;
  }

  public void setUserScriptBefore(String userScriptBefore) {
    this.userScriptBefore = userScriptBefore;
  }

  public Execcalcchartscript userScriptAfter(String userScriptAfter) {
    this.userScriptAfter = userScriptAfter;
    return this;
  }

   /**
   * Uživ. skript po
   * @return userScriptAfter
  **/
  @ApiModelProperty(example = "null", value = "Uživ. skript po")
  public String getUserScriptAfter() {
    return userScriptAfter;
  }

  public void setUserScriptAfter(String userScriptAfter) {
    this.userScriptAfter = userScriptAfter;
  }

  public Execcalcchartscript userExplanation(String userExplanation) {
    this.userExplanation = userExplanation;
    return this;
  }

   /**
   * Uživ. vysvětlení
   * @return userExplanation
  **/
  @ApiModelProperty(example = "null", value = "Uživ. vysvětlení")
  public String getUserExplanation() {
    return userExplanation;
  }

  public void setUserExplanation(String userExplanation) {
    this.userExplanation = userExplanation;
  }

  public Execcalcchartscript supressScriptBefore(Integer supressScriptBefore) {
    this.supressScriptBefore = supressScriptBefore;
    return this;
  }

   /**
   * Použít skript před
   * @return supressScriptBefore
  **/
  @ApiModelProperty(example = "null", value = "Použít skript před")
  public Integer getSupressScriptBefore() {
    return supressScriptBefore;
  }

  public void setSupressScriptBefore(Integer supressScriptBefore) {
    this.supressScriptBefore = supressScriptBefore;
  }

  public Execcalcchartscript supressScriptAfter(Integer supressScriptAfter) {
    this.supressScriptAfter = supressScriptAfter;
    return this;
  }

   /**
   * Použít skript po
   * @return supressScriptAfter
  **/
  @ApiModelProperty(example = "null", value = "Použít skript po")
  public Integer getSupressScriptAfter() {
    return supressScriptAfter;
  }

  public void setSupressScriptAfter(Integer supressScriptAfter) {
    this.supressScriptAfter = supressScriptAfter;
  }

  public Execcalcchartscript supressScriptBeforeText(String supressScriptBeforeText) {
    this.supressScriptBeforeText = supressScriptBeforeText;
    return this;
  }

   /**
   * Použít skript před
   * @return supressScriptBeforeText
  **/
  @ApiModelProperty(example = "null", value = "Použít skript před")
  public String getSupressScriptBeforeText() {
    return supressScriptBeforeText;
  }

  public void setSupressScriptBeforeText(String supressScriptBeforeText) {
    this.supressScriptBeforeText = supressScriptBeforeText;
  }

  public Execcalcchartscript supressScriptAfterText(String supressScriptAfterText) {
    this.supressScriptAfterText = supressScriptAfterText;
    return this;
  }

   /**
   * Použít skript po
   * @return supressScriptAfterText
  **/
  @ApiModelProperty(example = "null", value = "Použít skript po")
  public String getSupressScriptAfterText() {
    return supressScriptAfterText;
  }

  public void setSupressScriptAfterText(String supressScriptAfterText) {
    this.supressScriptAfterText = supressScriptAfterText;
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
    return Objects.equals(this.displayName, execcalcchartscript.displayName) &&
        Objects.equals(this.ID, execcalcchartscript.ID) &&
        Objects.equals(this.classID, execcalcchartscript.classID) &&
        Objects.equals(this.objVersion, execcalcchartscript.objVersion) &&
        Objects.equals(this.parentID, execcalcchartscript.parentID) &&
        Objects.equals(this.scriptBefore, execcalcchartscript.scriptBefore) &&
        Objects.equals(this.scriptAfter, execcalcchartscript.scriptAfter) &&
        Objects.equals(this.validFromDATE, execcalcchartscript.validFromDATE) &&
        Objects.equals(this.system, execcalcchartscript.system) &&
        Objects.equals(this.explanation, execcalcchartscript.explanation) &&
        Objects.equals(this.userScriptBefore, execcalcchartscript.userScriptBefore) &&
        Objects.equals(this.userScriptAfter, execcalcchartscript.userScriptAfter) &&
        Objects.equals(this.userExplanation, execcalcchartscript.userExplanation) &&
        Objects.equals(this.supressScriptBefore, execcalcchartscript.supressScriptBefore) &&
        Objects.equals(this.supressScriptAfter, execcalcchartscript.supressScriptAfter) &&
        Objects.equals(this.supressScriptBeforeText, execcalcchartscript.supressScriptBeforeText) &&
        Objects.equals(this.supressScriptAfterText, execcalcchartscript.supressScriptAfterText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, scriptBefore, scriptAfter, validFromDATE, system, explanation, userScriptBefore, userScriptAfter, userExplanation, supressScriptBefore, supressScriptAfter, supressScriptBeforeText, supressScriptAfterText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Execcalcchartscript {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    scriptBefore: ").append(toIndentedString(scriptBefore)).append("\n");
    sb.append("    scriptAfter: ").append(toIndentedString(scriptAfter)).append("\n");
    sb.append("    validFromDATE: ").append(toIndentedString(validFromDATE)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    userScriptBefore: ").append(toIndentedString(userScriptBefore)).append("\n");
    sb.append("    userScriptAfter: ").append(toIndentedString(userScriptAfter)).append("\n");
    sb.append("    userExplanation: ").append(toIndentedString(userExplanation)).append("\n");
    sb.append("    supressScriptBefore: ").append(toIndentedString(supressScriptBefore)).append("\n");
    sb.append("    supressScriptAfter: ").append(toIndentedString(supressScriptAfter)).append("\n");
    sb.append("    supressScriptBeforeText: ").append(toIndentedString(supressScriptBeforeText)).append("\n");
    sb.append("    supressScriptAfterText: ").append(toIndentedString(supressScriptAfterText)).append("\n");
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

