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
 * Evaluationcriterion
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Evaluationcriterion   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Evaluationcriteriondescscore> rows = new ArrayList<Evaluationcriteriondescscore>();

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("criteriontype")
  private Integer criteriontype = null;

  @SerializedName("expression")
  private String expression = null;

  @SerializedName("minscore")
  private Integer minscore = null;

  @SerializedName("maxscore")
  private Integer maxscore = null;

  @SerializedName("satisfactoryscore")
  private Integer satisfactoryscore = null;

  @SerializedName("datasources")
  private List<Evaluationcriteriondatasource> datasources = new ArrayList<Evaluationcriteriondatasource>();

  @SerializedName("conditionfortakeover")
  private String conditionfortakeover = null;

  @SerializedName("system")
  private Boolean system = null;

  public Evaluationcriterion displayname(String displayname) {
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

  public Evaluationcriterion id(String id) {
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

  public Evaluationcriterion classid(String classid) {
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

  public Evaluationcriterion objversion(Integer objversion) {
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

  public Evaluationcriterion rows(List<Evaluationcriteriondescscore> rows) {
    this.rows = rows;
    return this;
  }

  public Evaluationcriterion addRowsItem(Evaluationcriteriondescscore rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo hodnotící kritérium - popisy bodového hodnocení [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo hodnotící kritérium - popisy bodového hodnocení [nepersistentní položka]")
  public List<Evaluationcriteriondescscore> getRows() {
    return rows;
  }

  public void setRows(List<Evaluationcriteriondescscore> rows) {
    this.rows = rows;
  }

  public Evaluationcriterion code(String code) {
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

  public Evaluationcriterion name(String name) {
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

  public Evaluationcriterion description(String description) {
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

  public Evaluationcriterion criteriontype(Integer criteriontype) {
    this.criteriontype = criteriontype;
    return this;
  }

   /**
   * typ kritéria [persistentní položka]
   * @return criteriontype
  **/
  @ApiModelProperty(example = "null", value = "typ kritéria [persistentní položka]")
  public Integer getCriteriontype() {
    return criteriontype;
  }

  public void setCriteriontype(Integer criteriontype) {
    this.criteriontype = criteriontype;
  }

  public Evaluationcriterion expression(String expression) {
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

  public Evaluationcriterion minscore(Integer minscore) {
    this.minscore = minscore;
    return this;
  }

   /**
   * minimální počet bodů [persistentní položka]
   * @return minscore
  **/
  @ApiModelProperty(example = "null", value = "minimální počet bodů [persistentní položka]")
  public Integer getMinscore() {
    return minscore;
  }

  public void setMinscore(Integer minscore) {
    this.minscore = minscore;
  }

  public Evaluationcriterion maxscore(Integer maxscore) {
    this.maxscore = maxscore;
    return this;
  }

   /**
   * maximální počet bodů [persistentní položka]
   * @return maxscore
  **/
  @ApiModelProperty(example = "null", value = "maximální počet bodů [persistentní položka]")
  public Integer getMaxscore() {
    return maxscore;
  }

  public void setMaxscore(Integer maxscore) {
    this.maxscore = maxscore;
  }

  public Evaluationcriterion satisfactoryscore(Integer satisfactoryscore) {
    this.satisfactoryscore = satisfactoryscore;
    return this;
  }

   /**
   * počet bodů postačujících ke schválení [persistentní položka]
   * @return satisfactoryscore
  **/
  @ApiModelProperty(example = "null", value = "počet bodů postačujících ke schválení [persistentní položka]")
  public Integer getSatisfactoryscore() {
    return satisfactoryscore;
  }

  public void setSatisfactoryscore(Integer satisfactoryscore) {
    this.satisfactoryscore = satisfactoryscore;
  }

  public Evaluationcriterion datasources(List<Evaluationcriteriondatasource> datasources) {
    this.datasources = datasources;
    return this;
  }

  public Evaluationcriterion addDatasourcesItem(Evaluationcriteriondatasource datasourcesItem) {
    this.datasources.add(datasourcesItem);
    return this;
  }

   /**
   * datové zdroje; kolekce bo hodnotící kritérium - datové zdroje [nepersistentní položka]
   * @return datasources
  **/
  @ApiModelProperty(example = "null", value = "datové zdroje; kolekce bo hodnotící kritérium - datové zdroje [nepersistentní položka]")
  public List<Evaluationcriteriondatasource> getDatasources() {
    return datasources;
  }

  public void setDatasources(List<Evaluationcriteriondatasource> datasources) {
    this.datasources = datasources;
  }

  public Evaluationcriterion conditionfortakeover(String conditionfortakeover) {
    this.conditionfortakeover = conditionfortakeover;
    return this;
  }

   /**
   * podmínka pro převzetí [persistentní položka]
   * @return conditionfortakeover
  **/
  @ApiModelProperty(example = "null", value = "podmínka pro převzetí [persistentní položka]")
  public String getConditionfortakeover() {
    return conditionfortakeover;
  }

  public void setConditionfortakeover(String conditionfortakeover) {
    this.conditionfortakeover = conditionfortakeover;
  }

  public Evaluationcriterion system(Boolean system) {
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
    Evaluationcriterion evaluationcriterion = (Evaluationcriterion) o;
    return Objects.equals(this.displayname, evaluationcriterion.displayname) &&
        Objects.equals(this.id, evaluationcriterion.id) &&
        Objects.equals(this.classid, evaluationcriterion.classid) &&
        Objects.equals(this.objversion, evaluationcriterion.objversion) &&
        Objects.equals(this.rows, evaluationcriterion.rows) &&
        Objects.equals(this.code, evaluationcriterion.code) &&
        Objects.equals(this.name, evaluationcriterion.name) &&
        Objects.equals(this.description, evaluationcriterion.description) &&
        Objects.equals(this.criteriontype, evaluationcriterion.criteriontype) &&
        Objects.equals(this.expression, evaluationcriterion.expression) &&
        Objects.equals(this.minscore, evaluationcriterion.minscore) &&
        Objects.equals(this.maxscore, evaluationcriterion.maxscore) &&
        Objects.equals(this.satisfactoryscore, evaluationcriterion.satisfactoryscore) &&
        Objects.equals(this.datasources, evaluationcriterion.datasources) &&
        Objects.equals(this.conditionfortakeover, evaluationcriterion.conditionfortakeover) &&
        Objects.equals(this.system, evaluationcriterion.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, code, name, description, criteriontype, expression, minscore, maxscore, satisfactoryscore, datasources, conditionfortakeover, system);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evaluationcriterion {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    criteriontype: ").append(toIndentedString(criteriontype)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    minscore: ").append(toIndentedString(minscore)).append("\n");
    sb.append("    maxscore: ").append(toIndentedString(maxscore)).append("\n");
    sb.append("    satisfactoryscore: ").append(toIndentedString(satisfactoryscore)).append("\n");
    sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
    sb.append("    conditionfortakeover: ").append(toIndentedString(conditionfortakeover)).append("\n");
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

