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
 * Categoryitem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Categoryitem   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("itemtype")
  private Integer itemtype = null;

  @SerializedName("userfielddef2_id")
  private String userfielddef2Id = null;

  @SerializedName("categoryitemgroup_id")
  private String categoryitemgroupId = null;

  @SerializedName("expression")
  private String expression = null;

  @SerializedName("fieldname")
  private String fieldname = null;

  @SerializedName("fieldlabel")
  private String fieldlabel = null;

  @SerializedName("fieldhint")
  private String fieldhint = null;

  @SerializedName("itemtypetxt")
  private String itemtypetxt = null;

  @SerializedName("datatypetxt")
  private String datatypetxt = null;

  @SerializedName("fieldcode")
  private Integer fieldcode = null;

  @SerializedName("sqlquery")
  private String sqlquery = null;

  @SerializedName("datatype")
  private Integer datatype = null;

  @SerializedName("datasize")
  private Integer datasize = null;

  @SerializedName("decimalplaces")
  private Integer decimalplaces = null;

  public Categoryitem displayname(String displayname) {
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

  public Categoryitem id(String id) {
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

  public Categoryitem classid(String classid) {
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

  public Categoryitem objversion(Integer objversion) {
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

  public Categoryitem hidden(Boolean hidden) {
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

  public Categoryitem name(String name) {
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

  public Categoryitem itemtype(Integer itemtype) {
    this.itemtype = itemtype;
    return this;
  }

   /**
   * typ [persistentní položka]
   * @return itemtype
  **/
  @ApiModelProperty(example = "null", value = "typ [persistentní položka]")
  public Integer getItemtype() {
    return itemtype;
  }

  public void setItemtype(Integer itemtype) {
    this.itemtype = itemtype;
  }

  public Categoryitem userfielddef2Id(String userfielddef2Id) {
    this.userfielddef2Id = userfielddef2Id;
    return this;
  }

   /**
   * uživatelská položka; id objektu definovatelná položka [persistentní položka]
   * @return userfielddef2Id
  **/
  @ApiModelProperty(example = "null", value = "uživatelská položka; id objektu definovatelná položka [persistentní položka]")
  public String getUserfielddef2Id() {
    return userfielddef2Id;
  }

  public void setUserfielddef2Id(String userfielddef2Id) {
    this.userfielddef2Id = userfielddef2Id;
  }

  public Categoryitem categoryitemgroupId(String categoryitemgroupId) {
    this.categoryitemgroupId = categoryitemgroupId;
    return this;
  }

   /**
   * skupina; id objektu skupina kategorizačních údajů [persistentní položka]
   * @return categoryitemgroupId
  **/
  @ApiModelProperty(example = "null", value = "skupina; id objektu skupina kategorizačních údajů [persistentní položka]")
  public String getCategoryitemgroupId() {
    return categoryitemgroupId;
  }

  public void setCategoryitemgroupId(String categoryitemgroupId) {
    this.categoryitemgroupId = categoryitemgroupId;
  }

  public Categoryitem expression(String expression) {
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

  public Categoryitem fieldname(String fieldname) {
    this.fieldname = fieldname;
    return this;
  }

   /**
   * jméno položky [persistentní položka]
   * @return fieldname
  **/
  @ApiModelProperty(example = "null", value = "jméno položky [persistentní položka]")
  public String getFieldname() {
    return fieldname;
  }

  public void setFieldname(String fieldname) {
    this.fieldname = fieldname;
  }

  public Categoryitem fieldlabel(String fieldlabel) {
    this.fieldlabel = fieldlabel;
    return this;
  }

   /**
   * popis položky
   * @return fieldlabel
  **/
  @ApiModelProperty(example = "null", value = "popis položky")
  public String getFieldlabel() {
    return fieldlabel;
  }

  public void setFieldlabel(String fieldlabel) {
    this.fieldlabel = fieldlabel;
  }

  public Categoryitem fieldhint(String fieldhint) {
    this.fieldhint = fieldhint;
    return this;
  }

   /**
   * popiska položky
   * @return fieldhint
  **/
  @ApiModelProperty(example = "null", value = "popiska položky")
  public String getFieldhint() {
    return fieldhint;
  }

  public void setFieldhint(String fieldhint) {
    this.fieldhint = fieldhint;
  }

  public Categoryitem itemtypetxt(String itemtypetxt) {
    this.itemtypetxt = itemtypetxt;
    return this;
  }

   /**
   * typ
   * @return itemtypetxt
  **/
  @ApiModelProperty(example = "null", value = "typ")
  public String getItemtypetxt() {
    return itemtypetxt;
  }

  public void setItemtypetxt(String itemtypetxt) {
    this.itemtypetxt = itemtypetxt;
  }

  public Categoryitem datatypetxt(String datatypetxt) {
    this.datatypetxt = datatypetxt;
    return this;
  }

   /**
   * datový typ
   * @return datatypetxt
  **/
  @ApiModelProperty(example = "null", value = "datový typ")
  public String getDatatypetxt() {
    return datatypetxt;
  }

  public void setDatatypetxt(String datatypetxt) {
    this.datatypetxt = datatypetxt;
  }

  public Categoryitem fieldcode(Integer fieldcode) {
    this.fieldcode = fieldcode;
    return this;
  }

   /**
   * Číslo položky
   * @return fieldcode
  **/
  @ApiModelProperty(example = "null", value = "Číslo položky")
  public Integer getFieldcode() {
    return fieldcode;
  }

  public void setFieldcode(Integer fieldcode) {
    this.fieldcode = fieldcode;
  }

  public Categoryitem sqlquery(String sqlquery) {
    this.sqlquery = sqlquery;
    return this;
  }

   /**
   * definice [persistentní položka]
   * @return sqlquery
  **/
  @ApiModelProperty(example = "null", value = "definice [persistentní položka]")
  public String getSqlquery() {
    return sqlquery;
  }

  public void setSqlquery(String sqlquery) {
    this.sqlquery = sqlquery;
  }

  public Categoryitem datatype(Integer datatype) {
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

  public Categoryitem datasize(Integer datasize) {
    this.datasize = datasize;
    return this;
  }

   /**
   * velikost [persistentní položka]
   * @return datasize
  **/
  @ApiModelProperty(example = "null", value = "velikost [persistentní položka]")
  public Integer getDatasize() {
    return datasize;
  }

  public void setDatasize(Integer datasize) {
    this.datasize = datasize;
  }

  public Categoryitem decimalplaces(Integer decimalplaces) {
    this.decimalplaces = decimalplaces;
    return this;
  }

   /**
   * počet des.míst [persistentní položka]
   * @return decimalplaces
  **/
  @ApiModelProperty(example = "null", value = "počet des.míst [persistentní položka]")
  public Integer getDecimalplaces() {
    return decimalplaces;
  }

  public void setDecimalplaces(Integer decimalplaces) {
    this.decimalplaces = decimalplaces;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Categoryitem categoryitem = (Categoryitem) o;
    return Objects.equals(this.displayname, categoryitem.displayname) &&
        Objects.equals(this.id, categoryitem.id) &&
        Objects.equals(this.classid, categoryitem.classid) &&
        Objects.equals(this.objversion, categoryitem.objversion) &&
        Objects.equals(this.hidden, categoryitem.hidden) &&
        Objects.equals(this.name, categoryitem.name) &&
        Objects.equals(this.itemtype, categoryitem.itemtype) &&
        Objects.equals(this.userfielddef2Id, categoryitem.userfielddef2Id) &&
        Objects.equals(this.categoryitemgroupId, categoryitem.categoryitemgroupId) &&
        Objects.equals(this.expression, categoryitem.expression) &&
        Objects.equals(this.fieldname, categoryitem.fieldname) &&
        Objects.equals(this.fieldlabel, categoryitem.fieldlabel) &&
        Objects.equals(this.fieldhint, categoryitem.fieldhint) &&
        Objects.equals(this.itemtypetxt, categoryitem.itemtypetxt) &&
        Objects.equals(this.datatypetxt, categoryitem.datatypetxt) &&
        Objects.equals(this.fieldcode, categoryitem.fieldcode) &&
        Objects.equals(this.sqlquery, categoryitem.sqlquery) &&
        Objects.equals(this.datatype, categoryitem.datatype) &&
        Objects.equals(this.datasize, categoryitem.datasize) &&
        Objects.equals(this.decimalplaces, categoryitem.decimalplaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, hidden, name, itemtype, userfielddef2Id, categoryitemgroupId, expression, fieldname, fieldlabel, fieldhint, itemtypetxt, datatypetxt, fieldcode, sqlquery, datatype, datasize, decimalplaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Categoryitem {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    itemtype: ").append(toIndentedString(itemtype)).append("\n");
    sb.append("    userfielddef2Id: ").append(toIndentedString(userfielddef2Id)).append("\n");
    sb.append("    categoryitemgroupId: ").append(toIndentedString(categoryitemgroupId)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    fieldname: ").append(toIndentedString(fieldname)).append("\n");
    sb.append("    fieldlabel: ").append(toIndentedString(fieldlabel)).append("\n");
    sb.append("    fieldhint: ").append(toIndentedString(fieldhint)).append("\n");
    sb.append("    itemtypetxt: ").append(toIndentedString(itemtypetxt)).append("\n");
    sb.append("    datatypetxt: ").append(toIndentedString(datatypetxt)).append("\n");
    sb.append("    fieldcode: ").append(toIndentedString(fieldcode)).append("\n");
    sb.append("    sqlquery: ").append(toIndentedString(sqlquery)).append("\n");
    sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
    sb.append("    datasize: ").append(toIndentedString(datasize)).append("\n");
    sb.append("    decimalplaces: ").append(toIndentedString(decimalplaces)).append("\n");
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

