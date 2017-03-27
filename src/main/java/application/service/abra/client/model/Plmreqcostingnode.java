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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Plmreqcostingnode
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Plmreqcostingnode   {
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

  @SerializedName("PosIndex")
  private Integer posIndex = null;

  @SerializedName("Decomposition")
  private Boolean decomposition = null;

  @SerializedName("Issue")
  private Integer issue = null;

  @SerializedName("StoreCard_ID")
  private String storeCardID = null;

  @SerializedName("Master_ID")
  private String masterID = null;

  @SerializedName("OutputItem_ID")
  private Plmreqcostingnode outputItemID = null;

  @SerializedName("InputItem_ID")
  private Plmreqcostingnode inputItemID = null;

  @SerializedName("Rows")
  private List<Plmreqcostingnode> rows = new ArrayList<Plmreqcostingnode>();

  @SerializedName("TreePath")
  private String treePath = null;

  @SerializedName("TreePathHumanReadable")
  private String treePathHumanReadable = null;

  @SerializedName("TreeLevel")
  private Integer treeLevel = null;

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
   * Vlastník; ID objektu Požadavek na výrobu [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Požadavek na výrobu [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Plmreqcostingnode posIndex(Integer posIndex) {
    this.posIndex = posIndex;
    return this;
  }

   /**
   * Pozice [persistentní položka]
   * @return posIndex
  **/
  @ApiModelProperty(example = "null", value = "Pozice [persistentní položka]")
  public Integer getPosIndex() {
    return posIndex;
  }

  public void setPosIndex(Integer posIndex) {
    this.posIndex = posIndex;
  }

  public Plmreqcostingnode decomposition(Boolean decomposition) {
    this.decomposition = decomposition;
    return this;
  }

   /**
   * Decomposition [persistentní položka]
   * @return decomposition
  **/
  @ApiModelProperty(example = "null", value = "Decomposition [persistentní položka]")
  public Boolean getDecomposition() {
    return decomposition;
  }

  public void setDecomposition(Boolean decomposition) {
    this.decomposition = decomposition;
  }

  public Plmreqcostingnode issue(Integer issue) {
    this.issue = issue;
    return this;
  }

   /**
   * Typ řádku [persistentní položka]
   * @return issue
  **/
  @ApiModelProperty(example = "null", value = "Typ řádku [persistentní položka]")
  public Integer getIssue() {
    return issue;
  }

  public void setIssue(Integer issue) {
    this.issue = issue;
  }

  public Plmreqcostingnode storeCardID(String storeCardID) {
    this.storeCardID = storeCardID;
    return this;
  }

   /**
   * Skladová karta; ID objektu Skladová karta [persistentní položka]
   * @return storeCardID
  **/
  @ApiModelProperty(example = "null", value = "Skladová karta; ID objektu Skladová karta [persistentní položka]")
  public String getStoreCardID() {
    return storeCardID;
  }

  public void setStoreCardID(String storeCardID) {
    this.storeCardID = storeCardID;
  }

   /**
   * Nadřízený uzel; ID objektu Uzel stromu kalkulace požadavku na výrobu [persistentní položka]
   * @return masterID
  **/
  @ApiModelProperty(example = "null", value = "Nadřízený uzel; ID objektu Uzel stromu kalkulace požadavku na výrobu [persistentní položka]")
  public String getMasterID() {
    return masterID;
  }

  public Plmreqcostingnode outputItemID(Plmreqcostingnode outputItemID) {
    this.outputItemID = outputItemID;
    return this;
  }

   /**
   * Get outputItemID
   * @return outputItemID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Plmreqcostingnode getOutputItemID() {
    return outputItemID;
  }

  public void setOutputItemID(Plmreqcostingnode outputItemID) {
    this.outputItemID = outputItemID;
  }

  public Plmreqcostingnode inputItemID(Plmreqcostingnode inputItemID) {
    this.inputItemID = inputItemID;
    return this;
  }

   /**
   * Get inputItemID
   * @return inputItemID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Plmreqcostingnode getInputItemID() {
    return inputItemID;
  }

  public void setInputItemID(Plmreqcostingnode inputItemID) {
    this.inputItemID = inputItemID;
  }

  public Plmreqcostingnode rows(List<Plmreqcostingnode> rows) {
    this.rows = rows;
    return this;
  }

  public Plmreqcostingnode addRowsItem(Plmreqcostingnode rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce BO Uzel stromu kalkulace požadavku na výrobu [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce BO Uzel stromu kalkulace požadavku na výrobu [nepersistentní položka]")
  public List<Plmreqcostingnode> getRows() {
    return rows;
  }

  public void setRows(List<Plmreqcostingnode> rows) {
    this.rows = rows;
  }

   /**
   * Pořadí dle cesty ve stromu
   * @return treePath
  **/
  @ApiModelProperty(example = "null", value = "Pořadí dle cesty ve stromu")
  public String getTreePath() {
    return treePath;
  }

   /**
   * Pořadí dle cesty ve stromu
   * @return treePathHumanReadable
  **/
  @ApiModelProperty(example = "null", value = "Pořadí dle cesty ve stromu")
  public String getTreePathHumanReadable() {
    return treePathHumanReadable;
  }

   /**
   * Úroveň
   * @return treeLevel
  **/
  @ApiModelProperty(example = "null", value = "Úroveň")
  public Integer getTreeLevel() {
    return treeLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmreqcostingnode plmreqcostingnode = (Plmreqcostingnode) o;
    return Objects.equals(this.displayName, plmreqcostingnode.displayName) &&
        Objects.equals(this.ID, plmreqcostingnode.ID) &&
        Objects.equals(this.classID, plmreqcostingnode.classID) &&
        Objects.equals(this.objVersion, plmreqcostingnode.objVersion) &&
        Objects.equals(this.parentID, plmreqcostingnode.parentID) &&
        Objects.equals(this.posIndex, plmreqcostingnode.posIndex) &&
        Objects.equals(this.decomposition, plmreqcostingnode.decomposition) &&
        Objects.equals(this.issue, plmreqcostingnode.issue) &&
        Objects.equals(this.storeCardID, plmreqcostingnode.storeCardID) &&
        Objects.equals(this.masterID, plmreqcostingnode.masterID) &&
        Objects.equals(this.outputItemID, plmreqcostingnode.outputItemID) &&
        Objects.equals(this.inputItemID, plmreqcostingnode.inputItemID) &&
        Objects.equals(this.rows, plmreqcostingnode.rows) &&
        Objects.equals(this.treePath, plmreqcostingnode.treePath) &&
        Objects.equals(this.treePathHumanReadable, plmreqcostingnode.treePathHumanReadable) &&
        Objects.equals(this.treeLevel, plmreqcostingnode.treeLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, posIndex, decomposition, issue, storeCardID, masterID, outputItemID, inputItemID, rows, treePath, treePathHumanReadable, treeLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmreqcostingnode {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    posIndex: ").append(toIndentedString(posIndex)).append("\n");
    sb.append("    decomposition: ").append(toIndentedString(decomposition)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    storeCardID: ").append(toIndentedString(storeCardID)).append("\n");
    sb.append("    masterID: ").append(toIndentedString(masterID)).append("\n");
    sb.append("    outputItemID: ").append(toIndentedString(outputItemID)).append("\n");
    sb.append("    inputItemID: ").append(toIndentedString(inputItemID)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    treePath: ").append(toIndentedString(treePath)).append("\n");
    sb.append("    treePathHumanReadable: ").append(toIndentedString(treePathHumanReadable)).append("\n");
    sb.append("    treeLevel: ").append(toIndentedString(treeLevel)).append("\n");
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

