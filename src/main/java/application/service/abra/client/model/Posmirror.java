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
 * Posmirror
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Posmirror   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Posmirrorrow> rows = new ArrayList<Posmirrorrow>();

  @SerializedName("docqueue_id")
  private String docqueueId = null;

  @SerializedName("period_id")
  private String periodId = null;

  @SerializedName("ordnumber")
  private Integer ordnumber = null;

  @SerializedName("docdate$date")
  private DateTime docdatedate = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("newrelatedtype")
  private Integer newrelatedtype = null;

  @SerializedName("newrelateddocument_id")
  private String newrelateddocumentId = null;

  @SerializedName("createddate$date")
  private DateTime createddatedate = null;

  @SerializedName("closeddate$date")
  private DateTime closeddatedate = null;

  @SerializedName("authorizedby_id")
  private String authorizedbyId = null;

  @SerializedName("closedby_id")
  private String closedbyId = null;

  @SerializedName("store_id")
  private String storeId = null;

  @SerializedName("shortfallamount")
  private Double shortfallamount = null;

  @SerializedName("shortfallamountrounding")
  private Double shortfallamountrounding = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("shortfall_id")
  private String shortfallId = null;

  @SerializedName("xshortfall_id")
  private String xshortfallId = null;

  @SerializedName("overplus_id")
  private String overplusId = null;

  @SerializedName("xoverplus_id")
  private String xoverplusId = null;

  @SerializedName("poscashreceived_id")
  private String poscashreceivedId = null;

  @SerializedName("poscashpaid_id")
  private String poscashpaidId = null;

  @SerializedName("posdocument_id")
  private String posdocumentId = null;

  @SerializedName("xposdocument_id")
  private String xposdocumentId = null;

  @SerializedName("originalmirror_id")
  private String originalmirrorId = null;

  @SerializedName("virtualpos_id")
  private String virtualposId = null;

  @SerializedName("shop_id")
  private String shopId = null;

  @SerializedName("division_id")
  private String divisionId = null;

  @SerializedName("busorder_id")
  private String busorderId = null;

  @SerializedName("bustransaction_id")
  private String bustransactionId = null;

  @SerializedName("busproject_id")
  private String busprojectId = null;

  public Posmirror displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * Číslo dok.
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "Číslo dok.")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Posmirror id(String id) {
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

  public Posmirror classid(String classid) {
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

  public Posmirror objversion(Integer objversion) {
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

  public Posmirror rows(List<Posmirrorrow> rows) {
    this.rows = rows;
    return this;
  }

  public Posmirror addRowsItem(Posmirrorrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo zrcadlo - řádek [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo zrcadlo - řádek [nepersistentní položka]")
  public List<Posmirrorrow> getRows() {
    return rows;
  }

  public void setRows(List<Posmirrorrow> rows) {
    this.rows = rows;
  }

  public Posmirror docqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
    return this;
  }

   /**
   * zdrojová řada; id objektu Řada dokladů [persistentní položka]
   * @return docqueueId
  **/
  @ApiModelProperty(example = "null", value = "zdrojová řada; id objektu Řada dokladů [persistentní položka]")
  public String getDocqueueId() {
    return docqueueId;
  }

  public void setDocqueueId(String docqueueId) {
    this.docqueueId = docqueueId;
  }

  public Posmirror periodId(String periodId) {
    this.periodId = periodId;
    return this;
  }

   /**
   * období; id objektu období [persistentní položka]
   * @return periodId
  **/
  @ApiModelProperty(example = "null", value = "období; id objektu období [persistentní položka]")
  public String getPeriodId() {
    return periodId;
  }

  public void setPeriodId(String periodId) {
    this.periodId = periodId;
  }

  public Posmirror ordnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
    return this;
  }

   /**
   * pořadové číslo [persistentní položka]
   * @return ordnumber
  **/
  @ApiModelProperty(example = "null", value = "pořadové číslo [persistentní položka]")
  public Integer getOrdnumber() {
    return ordnumber;
  }

  public void setOrdnumber(Integer ordnumber) {
    this.ordnumber = ordnumber;
  }

  public Posmirror docdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
    return this;
  }

   /**
   * datum dok. [persistentní položka]
   * @return docdatedate
  **/
  @ApiModelProperty(example = "null", value = "datum dok. [persistentní položka]")
  public DateTime getDocdatedate() {
    return docdatedate;
  }

  public void setDocdatedate(DateTime docdatedate) {
    this.docdatedate = docdatedate;
  }

  public Posmirror createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * vytvořil; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "vytvořil; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Posmirror newrelatedtype(Integer newrelatedtype) {
    this.newrelatedtype = newrelatedtype;
    return this;
  }

   /**
   * typ relace
   * @return newrelatedtype
  **/
  @ApiModelProperty(example = "null", value = "typ relace")
  public Integer getNewrelatedtype() {
    return newrelatedtype;
  }

  public void setNewrelatedtype(Integer newrelatedtype) {
    this.newrelatedtype = newrelatedtype;
  }

  public Posmirror newrelateddocumentId(String newrelateddocumentId) {
    this.newrelateddocumentId = newrelateddocumentId;
    return this;
  }

   /**
   * id dokladu pro připojení
   * @return newrelateddocumentId
  **/
  @ApiModelProperty(example = "null", value = "id dokladu pro připojení")
  public String getNewrelateddocumentId() {
    return newrelateddocumentId;
  }

  public void setNewrelateddocumentId(String newrelateddocumentId) {
    this.newrelateddocumentId = newrelateddocumentId;
  }

  public Posmirror createddatedate(DateTime createddatedate) {
    this.createddatedate = createddatedate;
    return this;
  }

   /**
   * datum a čas vytvoření zrcadla [persistentní položka]
   * @return createddatedate
  **/
  @ApiModelProperty(example = "null", value = "datum a čas vytvoření zrcadla [persistentní položka]")
  public DateTime getCreateddatedate() {
    return createddatedate;
  }

  public void setCreateddatedate(DateTime createddatedate) {
    this.createddatedate = createddatedate;
  }

  public Posmirror closeddatedate(DateTime closeddatedate) {
    this.closeddatedate = closeddatedate;
    return this;
  }

   /**
   * datum a čas uzavření zrcadla [persistentní položka]
   * @return closeddatedate
  **/
  @ApiModelProperty(example = "null", value = "datum a čas uzavření zrcadla [persistentní položka]")
  public DateTime getCloseddatedate() {
    return closeddatedate;
  }

  public void setCloseddatedate(DateTime closeddatedate) {
    this.closeddatedate = closeddatedate;
  }

  public Posmirror authorizedbyId(String authorizedbyId) {
    this.authorizedbyId = authorizedbyId;
    return this;
  }

   /**
   * obsluhující, který autorizoval změny u manka; id objektu uživatel [persistentní položka]
   * @return authorizedbyId
  **/
  @ApiModelProperty(example = "null", value = "obsluhující, který autorizoval změny u manka; id objektu uživatel [persistentní položka]")
  public String getAuthorizedbyId() {
    return authorizedbyId;
  }

  public void setAuthorizedbyId(String authorizedbyId) {
    this.authorizedbyId = authorizedbyId;
  }

  public Posmirror closedbyId(String closedbyId) {
    this.closedbyId = closedbyId;
    return this;
  }

   /**
   * obsluhující, který zrcadlo uzavřel (vypořádal); id objektu uživatel [persistentní položka]
   * @return closedbyId
  **/
  @ApiModelProperty(example = "null", value = "obsluhující, který zrcadlo uzavřel (vypořádal); id objektu uživatel [persistentní položka]")
  public String getClosedbyId() {
    return closedbyId;
  }

  public void setClosedbyId(String closedbyId) {
    this.closedbyId = closedbyId;
  }

  public Posmirror storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * sklad; id objektu sklad [persistentní položka]
   * @return storeId
  **/
  @ApiModelProperty(example = "null", value = "sklad; id objektu sklad [persistentní položka]")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public Posmirror shortfallamount(Double shortfallamount) {
    this.shortfallamount = shortfallamount;
    return this;
  }

   /**
   * manko v prodejních cenách vč. dph [persistentní položka]
   * @return shortfallamount
  **/
  @ApiModelProperty(example = "null", value = "manko v prodejních cenách vč. dph [persistentní položka]")
  public Double getShortfallamount() {
    return shortfallamount;
  }

  public void setShortfallamount(Double shortfallamount) {
    this.shortfallamount = shortfallamount;
  }

  public Posmirror shortfallamountrounding(Double shortfallamountrounding) {
    this.shortfallamountrounding = shortfallamountrounding;
    return this;
  }

   /**
   * haléřové vyrovnání manka [persistentní položka]
   * @return shortfallamountrounding
  **/
  @ApiModelProperty(example = "null", value = "haléřové vyrovnání manka [persistentní položka]")
  public Double getShortfallamountrounding() {
    return shortfallamountrounding;
  }

  public void setShortfallamountrounding(Double shortfallamountrounding) {
    this.shortfallamountrounding = shortfallamountrounding;
  }

  public Posmirror status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * stav zrcadla [persistentní položka]
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "stav zrcadla [persistentní položka]")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Posmirror shortfallId(String shortfallId) {
    this.shortfallId = shortfallId;
    return this;
  }

   /**
   * doklad o inventárním manku; id objektu inventární manko [persistentní položka]
   * @return shortfallId
  **/
  @ApiModelProperty(example = "null", value = "doklad o inventárním manku; id objektu inventární manko [persistentní položka]")
  public String getShortfallId() {
    return shortfallId;
  }

  public void setShortfallId(String shortfallId) {
    this.shortfallId = shortfallId;
  }

  public Posmirror xshortfallId(String xshortfallId) {
    this.xshortfallId = xshortfallId;
    return this;
  }

   /**
   * storno přebytku z původního zrcadla; id objektu inventární manko [persistentní položka]
   * @return xshortfallId
  **/
  @ApiModelProperty(example = "null", value = "storno přebytku z původního zrcadla; id objektu inventární manko [persistentní položka]")
  public String getXshortfallId() {
    return xshortfallId;
  }

  public void setXshortfallId(String xshortfallId) {
    this.xshortfallId = xshortfallId;
  }

  public Posmirror overplusId(String overplusId) {
    this.overplusId = overplusId;
    return this;
  }

   /**
   * doklad o inventárním přebytku; id objektu inventární přebytek [persistentní položka]
   * @return overplusId
  **/
  @ApiModelProperty(example = "null", value = "doklad o inventárním přebytku; id objektu inventární přebytek [persistentní položka]")
  public String getOverplusId() {
    return overplusId;
  }

  public void setOverplusId(String overplusId) {
    this.overplusId = overplusId;
  }

  public Posmirror xoverplusId(String xoverplusId) {
    this.xoverplusId = xoverplusId;
    return this;
  }

   /**
   * storno manka z původního zrcadla; id objektu inventární přebytek [persistentní položka]
   * @return xoverplusId
  **/
  @ApiModelProperty(example = "null", value = "storno manka z původního zrcadla; id objektu inventární přebytek [persistentní položka]")
  public String getXoverplusId() {
    return xoverplusId;
  }

  public void setXoverplusId(String xoverplusId) {
    this.xoverplusId = xoverplusId;
  }

  public Posmirror poscashreceivedId(String poscashreceivedId) {
    this.poscashreceivedId = poscashreceivedId;
    return this;
  }

   /**
   * doklad ppp k manku ze zrcadla; id objektu vklad do pokladního místa [persistentní položka]
   * @return poscashreceivedId
  **/
  @ApiModelProperty(example = "null", value = "doklad ppp k manku ze zrcadla; id objektu vklad do pokladního místa [persistentní položka]")
  public String getPoscashreceivedId() {
    return poscashreceivedId;
  }

  public void setPoscashreceivedId(String poscashreceivedId) {
    this.poscashreceivedId = poscashreceivedId;
  }

  public Posmirror poscashpaidId(String poscashpaidId) {
    this.poscashpaidId = poscashpaidId;
    return this;
  }

   /**
   * doklad vpp k opravě manka ze zrcadla; id objektu výdej z pokladního místa [persistentní položka]
   * @return poscashpaidId
  **/
  @ApiModelProperty(example = "null", value = "doklad vpp k opravě manka ze zrcadla; id objektu výdej z pokladního místa [persistentní položka]")
  public String getPoscashpaidId() {
    return poscashpaidId;
  }

  public void setPoscashpaidId(String poscashpaidId) {
    this.poscashpaidId = poscashpaidId;
  }

  public Posmirror posdocumentId(String posdocumentId) {
    this.posdocumentId = posdocumentId;
    return this;
  }

   /**
   * Účtenka manka ze zrcadla; id objektu Účtenka
   * @return posdocumentId
  **/
  @ApiModelProperty(example = "null", value = "Účtenka manka ze zrcadla; id objektu Účtenka")
  public String getPosdocumentId() {
    return posdocumentId;
  }

  public void setPosdocumentId(String posdocumentId) {
    this.posdocumentId = posdocumentId;
  }

  public Posmirror xposdocumentId(String xposdocumentId) {
    this.xposdocumentId = xposdocumentId;
    return this;
  }

   /**
   * storno účtenky z předchozího zrcadla; id objektu Účtenka
   * @return xposdocumentId
  **/
  @ApiModelProperty(example = "null", value = "storno účtenky z předchozího zrcadla; id objektu Účtenka")
  public String getXposdocumentId() {
    return xposdocumentId;
  }

  public void setXposdocumentId(String xposdocumentId) {
    this.xposdocumentId = xposdocumentId;
  }

  public Posmirror originalmirrorId(String originalmirrorId) {
    this.originalmirrorId = originalmirrorId;
    return this;
  }

   /**
   * opravené zrcadlo; id objektu zrcadlo [persistentní položka]
   * @return originalmirrorId
  **/
  @ApiModelProperty(example = "null", value = "opravené zrcadlo; id objektu zrcadlo [persistentní položka]")
  public String getOriginalmirrorId() {
    return originalmirrorId;
  }

  public void setOriginalmirrorId(String originalmirrorId) {
    this.originalmirrorId = originalmirrorId;
  }

  public Posmirror virtualposId(String virtualposId) {
    this.virtualposId = virtualposId;
    return this;
  }

   /**
   * pokladní místo; id objektu pokladní místo [persistentní položka]
   * @return virtualposId
  **/
  @ApiModelProperty(example = "null", value = "pokladní místo; id objektu pokladní místo [persistentní položka]")
  public String getVirtualposId() {
    return virtualposId;
  }

  public void setVirtualposId(String virtualposId) {
    this.virtualposId = virtualposId;
  }

  public Posmirror shopId(String shopId) {
    this.shopId = shopId;
    return this;
  }

   /**
   * provoz; id objektu nastavení provozu [persistentní položka]
   * @return shopId
  **/
  @ApiModelProperty(example = "null", value = "provoz; id objektu nastavení provozu [persistentní položka]")
  public String getShopId() {
    return shopId;
  }

  public void setShopId(String shopId) {
    this.shopId = shopId;
  }

  public Posmirror divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }

   /**
   * středisko; id objektu středisko [persistentní položka]
   * @return divisionId
  **/
  @ApiModelProperty(example = "null", value = "středisko; id objektu středisko [persistentní položka]")
  public String getDivisionId() {
    return divisionId;
  }

  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  public Posmirror busorderId(String busorderId) {
    this.busorderId = busorderId;
    return this;
  }

   /**
   * zakázka; id objektu zakázka [persistentní položka]
   * @return busorderId
  **/
  @ApiModelProperty(example = "null", value = "zakázka; id objektu zakázka [persistentní položka]")
  public String getBusorderId() {
    return busorderId;
  }

  public void setBusorderId(String busorderId) {
    this.busorderId = busorderId;
  }

  public Posmirror bustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
    return this;
  }

   /**
   * obchodní případ; id objektu obchodní případ [persistentní položka]
   * @return bustransactionId
  **/
  @ApiModelProperty(example = "null", value = "obchodní případ; id objektu obchodní případ [persistentní položka]")
  public String getBustransactionId() {
    return bustransactionId;
  }

  public void setBustransactionId(String bustransactionId) {
    this.bustransactionId = bustransactionId;
  }

  public Posmirror busprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
    return this;
  }

   /**
   * projekt; id objektu projekt [persistentní položka]
   * @return busprojectId
  **/
  @ApiModelProperty(example = "null", value = "projekt; id objektu projekt [persistentní položka]")
  public String getBusprojectId() {
    return busprojectId;
  }

  public void setBusprojectId(String busprojectId) {
    this.busprojectId = busprojectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Posmirror posmirror = (Posmirror) o;
    return Objects.equals(this.displayname, posmirror.displayname) &&
        Objects.equals(this.id, posmirror.id) &&
        Objects.equals(this.classid, posmirror.classid) &&
        Objects.equals(this.objversion, posmirror.objversion) &&
        Objects.equals(this.rows, posmirror.rows) &&
        Objects.equals(this.docqueueId, posmirror.docqueueId) &&
        Objects.equals(this.periodId, posmirror.periodId) &&
        Objects.equals(this.ordnumber, posmirror.ordnumber) &&
        Objects.equals(this.docdatedate, posmirror.docdatedate) &&
        Objects.equals(this.createdbyId, posmirror.createdbyId) &&
        Objects.equals(this.newrelatedtype, posmirror.newrelatedtype) &&
        Objects.equals(this.newrelateddocumentId, posmirror.newrelateddocumentId) &&
        Objects.equals(this.createddatedate, posmirror.createddatedate) &&
        Objects.equals(this.closeddatedate, posmirror.closeddatedate) &&
        Objects.equals(this.authorizedbyId, posmirror.authorizedbyId) &&
        Objects.equals(this.closedbyId, posmirror.closedbyId) &&
        Objects.equals(this.storeId, posmirror.storeId) &&
        Objects.equals(this.shortfallamount, posmirror.shortfallamount) &&
        Objects.equals(this.shortfallamountrounding, posmirror.shortfallamountrounding) &&
        Objects.equals(this.status, posmirror.status) &&
        Objects.equals(this.shortfallId, posmirror.shortfallId) &&
        Objects.equals(this.xshortfallId, posmirror.xshortfallId) &&
        Objects.equals(this.overplusId, posmirror.overplusId) &&
        Objects.equals(this.xoverplusId, posmirror.xoverplusId) &&
        Objects.equals(this.poscashreceivedId, posmirror.poscashreceivedId) &&
        Objects.equals(this.poscashpaidId, posmirror.poscashpaidId) &&
        Objects.equals(this.posdocumentId, posmirror.posdocumentId) &&
        Objects.equals(this.xposdocumentId, posmirror.xposdocumentId) &&
        Objects.equals(this.originalmirrorId, posmirror.originalmirrorId) &&
        Objects.equals(this.virtualposId, posmirror.virtualposId) &&
        Objects.equals(this.shopId, posmirror.shopId) &&
        Objects.equals(this.divisionId, posmirror.divisionId) &&
        Objects.equals(this.busorderId, posmirror.busorderId) &&
        Objects.equals(this.bustransactionId, posmirror.bustransactionId) &&
        Objects.equals(this.busprojectId, posmirror.busprojectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, docqueueId, periodId, ordnumber, docdatedate, createdbyId, newrelatedtype, newrelateddocumentId, createddatedate, closeddatedate, authorizedbyId, closedbyId, storeId, shortfallamount, shortfallamountrounding, status, shortfallId, xshortfallId, overplusId, xoverplusId, poscashreceivedId, poscashpaidId, posdocumentId, xposdocumentId, originalmirrorId, virtualposId, shopId, divisionId, busorderId, bustransactionId, busprojectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Posmirror {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    docqueueId: ").append(toIndentedString(docqueueId)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    ordnumber: ").append(toIndentedString(ordnumber)).append("\n");
    sb.append("    docdatedate: ").append(toIndentedString(docdatedate)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    newrelatedtype: ").append(toIndentedString(newrelatedtype)).append("\n");
    sb.append("    newrelateddocumentId: ").append(toIndentedString(newrelateddocumentId)).append("\n");
    sb.append("    createddatedate: ").append(toIndentedString(createddatedate)).append("\n");
    sb.append("    closeddatedate: ").append(toIndentedString(closeddatedate)).append("\n");
    sb.append("    authorizedbyId: ").append(toIndentedString(authorizedbyId)).append("\n");
    sb.append("    closedbyId: ").append(toIndentedString(closedbyId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    shortfallamount: ").append(toIndentedString(shortfallamount)).append("\n");
    sb.append("    shortfallamountrounding: ").append(toIndentedString(shortfallamountrounding)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    shortfallId: ").append(toIndentedString(shortfallId)).append("\n");
    sb.append("    xshortfallId: ").append(toIndentedString(xshortfallId)).append("\n");
    sb.append("    overplusId: ").append(toIndentedString(overplusId)).append("\n");
    sb.append("    xoverplusId: ").append(toIndentedString(xoverplusId)).append("\n");
    sb.append("    poscashreceivedId: ").append(toIndentedString(poscashreceivedId)).append("\n");
    sb.append("    poscashpaidId: ").append(toIndentedString(poscashpaidId)).append("\n");
    sb.append("    posdocumentId: ").append(toIndentedString(posdocumentId)).append("\n");
    sb.append("    xposdocumentId: ").append(toIndentedString(xposdocumentId)).append("\n");
    sb.append("    originalmirrorId: ").append(toIndentedString(originalmirrorId)).append("\n");
    sb.append("    virtualposId: ").append(toIndentedString(virtualposId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    busorderId: ").append(toIndentedString(busorderId)).append("\n");
    sb.append("    bustransactionId: ").append(toIndentedString(bustransactionId)).append("\n");
    sb.append("    busprojectId: ").append(toIndentedString(busprojectId)).append("\n");
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

