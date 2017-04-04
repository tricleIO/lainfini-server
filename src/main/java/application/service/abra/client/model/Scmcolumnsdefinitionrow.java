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
 * Scmcolumnsdefinitionrow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Scmcolumnsdefinitionrow   {
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

  @SerializedName("posindex")
  private Integer posindex = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("caption")
  private String caption = null;

  @SerializedName("iscalculated")
  private Boolean iscalculated = null;

  @SerializedName("datasource_id")
  private String datasourceId = null;

  @SerializedName("fieldname")
  private String fieldname = null;

  @SerializedName("datatype")
  private Integer datatype = null;

  @SerializedName("kind")
  private Integer kind = null;

  @SerializedName("displaywidth")
  private Integer displaywidth = null;

  @SerializedName("aggregatefunction")
  private Integer aggregatefunction = null;

  @SerializedName("includetoresult")
  private Boolean includetoresult = null;

  @SerializedName("expression")
  private String expression = null;

  @SerializedName("showcondition")
  private String showcondition = null;

  @SerializedName("conditions")
  private byte[] conditions = null;

  @SerializedName("system")
  private Boolean system = null;

  public Scmcolumnsdefinitionrow displayname(String displayname) {
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

  public Scmcolumnsdefinitionrow id(String id) {
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

  public Scmcolumnsdefinitionrow classid(String classid) {
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

  public Scmcolumnsdefinitionrow objversion(Integer objversion) {
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

  public Scmcolumnsdefinitionrow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu definice sloupců bilance [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu definice sloupců bilance [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Scmcolumnsdefinitionrow posindex(Integer posindex) {
    this.posindex = posindex;
    return this;
  }

   /**
   * pořadí [persistentní položka]
   * @return posindex
  **/
  @ApiModelProperty(example = "null", value = "pořadí [persistentní položka]")
  public Integer getPosindex() {
    return posindex;
  }

  public void setPosindex(Integer posindex) {
    this.posindex = posindex;
  }

  public Scmcolumnsdefinitionrow name(String name) {
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

  public Scmcolumnsdefinitionrow caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * popisek [persistentní položka]
   * @return caption
  **/
  @ApiModelProperty(example = "null", value = "popisek [persistentní položka]")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public Scmcolumnsdefinitionrow iscalculated(Boolean iscalculated) {
    this.iscalculated = iscalculated;
    return this;
  }

   /**
   * počítaný sloupec [persistentní položka]
   * @return iscalculated
  **/
  @ApiModelProperty(example = "null", value = "počítaný sloupec [persistentní položka]")
  public Boolean getIscalculated() {
    return iscalculated;
  }

  public void setIscalculated(Boolean iscalculated) {
    this.iscalculated = iscalculated;
  }

  public Scmcolumnsdefinitionrow datasourceId(String datasourceId) {
    this.datasourceId = datasourceId;
    return this;
  }

   /**
   * datový zdroj; id objektu datový zdroj [persistentní položka]
   * @return datasourceId
  **/
  @ApiModelProperty(example = "null", value = "datový zdroj; id objektu datový zdroj [persistentní položka]")
  public String getDatasourceId() {
    return datasourceId;
  }

  public void setDatasourceId(String datasourceId) {
    this.datasourceId = datasourceId;
  }

  public Scmcolumnsdefinitionrow fieldname(String fieldname) {
    this.fieldname = fieldname;
    return this;
  }

   /**
   * sloupec [persistentní položka]
   * @return fieldname
  **/
  @ApiModelProperty(example = "null", value = "sloupec [persistentní položka]")
  public String getFieldname() {
    return fieldname;
  }

  public void setFieldname(String fieldname) {
    this.fieldname = fieldname;
  }

  public Scmcolumnsdefinitionrow datatype(Integer datatype) {
    this.datatype = datatype;
    return this;
  }

   /**
   * datový typ [persistentní položka]
   * @return datatype
  **/
  @ApiModelProperty(example = "null", value = "datový typ [persistentní položka]")
  public Integer getDatatype() {
    return datatype;
  }

  public void setDatatype(Integer datatype) {
    this.datatype = datatype;
  }

  public Scmcolumnsdefinitionrow kind(Integer kind) {
    this.kind = kind;
    return this;
  }

   /**
   * typ sloupce [persistentní položka]
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "typ sloupce [persistentní položka]")
  public Integer getKind() {
    return kind;
  }

  public void setKind(Integer kind) {
    this.kind = kind;
  }

  public Scmcolumnsdefinitionrow displaywidth(Integer displaywidth) {
    this.displaywidth = displaywidth;
    return this;
  }

   /**
   * zobrazovací velikost [persistentní položka]
   * @return displaywidth
  **/
  @ApiModelProperty(example = "null", value = "zobrazovací velikost [persistentní položka]")
  public Integer getDisplaywidth() {
    return displaywidth;
  }

  public void setDisplaywidth(Integer displaywidth) {
    this.displaywidth = displaywidth;
  }

  public Scmcolumnsdefinitionrow aggregatefunction(Integer aggregatefunction) {
    this.aggregatefunction = aggregatefunction;
    return this;
  }

   /**
   * agregační funkce [persistentní položka]
   * @return aggregatefunction
  **/
  @ApiModelProperty(example = "null", value = "agregační funkce [persistentní položka]")
  public Integer getAggregatefunction() {
    return aggregatefunction;
  }

  public void setAggregatefunction(Integer aggregatefunction) {
    this.aggregatefunction = aggregatefunction;
  }

  public Scmcolumnsdefinitionrow includetoresult(Boolean includetoresult) {
    this.includetoresult = includetoresult;
    return this;
  }

   /**
   * započítat [persistentní položka]
   * @return includetoresult
  **/
  @ApiModelProperty(example = "null", value = "započítat [persistentní položka]")
  public Boolean getIncludetoresult() {
    return includetoresult;
  }

  public void setIncludetoresult(Boolean includetoresult) {
    this.includetoresult = includetoresult;
  }

  public Scmcolumnsdefinitionrow expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * výraz [persistentní položka]
   * @return expression
  **/
  @ApiModelProperty(example = "null", value = "výraz [persistentní položka]")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public Scmcolumnsdefinitionrow showcondition(String showcondition) {
    this.showcondition = showcondition;
    return this;
  }

   /**
   * zobrazovací podmínka [persistentní položka]
   * @return showcondition
  **/
  @ApiModelProperty(example = "null", value = "zobrazovací podmínka [persistentní položka]")
  public String getShowcondition() {
    return showcondition;
  }

  public void setShowcondition(String showcondition) {
    this.showcondition = showcondition;
  }

  public Scmcolumnsdefinitionrow conditions(byte[] conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * podmínky [persistentní položka]
   * @return conditions
  **/
  @ApiModelProperty(example = "null", value = "podmínky [persistentní položka]")
  public byte[] getConditions() {
    return conditions;
  }

  public void setConditions(byte[] conditions) {
    this.conditions = conditions;
  }

  public Scmcolumnsdefinitionrow system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * systémový [persistentní položka]
   * @return system
  **/
  @ApiModelProperty(example = "null", value = "systémový [persistentní položka]")
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scmcolumnsdefinitionrow scmcolumnsdefinitionrow = (Scmcolumnsdefinitionrow) o;
    return Objects.equals(this.displayname, scmcolumnsdefinitionrow.displayname) &&
        Objects.equals(this.id, scmcolumnsdefinitionrow.id) &&
        Objects.equals(this.classid, scmcolumnsdefinitionrow.classid) &&
        Objects.equals(this.objversion, scmcolumnsdefinitionrow.objversion) &&
        Objects.equals(this.parentId, scmcolumnsdefinitionrow.parentId) &&
        Objects.equals(this.posindex, scmcolumnsdefinitionrow.posindex) &&
        Objects.equals(this.name, scmcolumnsdefinitionrow.name) &&
        Objects.equals(this.caption, scmcolumnsdefinitionrow.caption) &&
        Objects.equals(this.iscalculated, scmcolumnsdefinitionrow.iscalculated) &&
        Objects.equals(this.datasourceId, scmcolumnsdefinitionrow.datasourceId) &&
        Objects.equals(this.fieldname, scmcolumnsdefinitionrow.fieldname) &&
        Objects.equals(this.datatype, scmcolumnsdefinitionrow.datatype) &&
        Objects.equals(this.kind, scmcolumnsdefinitionrow.kind) &&
        Objects.equals(this.displaywidth, scmcolumnsdefinitionrow.displaywidth) &&
        Objects.equals(this.aggregatefunction, scmcolumnsdefinitionrow.aggregatefunction) &&
        Objects.equals(this.includetoresult, scmcolumnsdefinitionrow.includetoresult) &&
        Objects.equals(this.expression, scmcolumnsdefinitionrow.expression) &&
        Objects.equals(this.showcondition, scmcolumnsdefinitionrow.showcondition) &&
        Objects.equals(this.conditions, scmcolumnsdefinitionrow.conditions) &&
        Objects.equals(this.system, scmcolumnsdefinitionrow.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, posindex, name, caption, iscalculated, datasourceId, fieldname, datatype, kind, displaywidth, aggregatefunction, includetoresult, expression, showcondition, conditions, system);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scmcolumnsdefinitionrow {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    posindex: ").append(toIndentedString(posindex)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    iscalculated: ").append(toIndentedString(iscalculated)).append("\n");
    sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
    sb.append("    fieldname: ").append(toIndentedString(fieldname)).append("\n");
    sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    displaywidth: ").append(toIndentedString(displaywidth)).append("\n");
    sb.append("    aggregatefunction: ").append(toIndentedString(aggregatefunction)).append("\n");
    sb.append("    includetoresult: ").append(toIndentedString(includetoresult)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    showcondition: ").append(toIndentedString(showcondition)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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
