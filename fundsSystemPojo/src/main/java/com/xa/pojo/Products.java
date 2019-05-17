package com.xa.pojo;

import java.io.Serializable;

public class Products implements Serializable {
    private Integer pid;

    private Integer mpid;

    private String productname;

    private String pstart;

    private String plimit;

    private String pearnings;

    private String netvalue;

    private String pstaus;

    private String company;

    private String grade;

    private String organization;

    private String trustee;

    private String adviser;

    private String broker;

    private String pdeadline;

    private String lineof;

    private String lossline;

    private String signingperiod;

    private String enddate;

    private String currency;

    private String financing;

    private String financingname;

    private String raiseway;

    private String payment;

    private String reservationstart;

    private String reservationend;

    private String currentnetworth;

    private String frequency;

    private String phighlights;

    private String mobility;

    private String joinmoney;

    private String coststructure;

    private String distribution;

    private String pdetail;

    private String pevaluation;

    private String pmaterial;

    private String goals;

    private String investmentscope;

    private String redundancyone;

    private String redundancytwo;

    private String redundancythr;

    private String ptype;

    private String riskgrade;

    private String biddeadline;

    private Integer prodel;

    private Orderlist orderlist;

    public Orderlist getOrderlist() {
        return orderlist;
    }

    @Override
    public String toString() {
        return "Products{" +
                "pid=" + pid +
                ", mpid=" + mpid +
                ", productname='" + productname + '\'' +
                ", pstart='" + pstart + '\'' +
                ", plimit='" + plimit + '\'' +
                ", pearnings='" + pearnings + '\'' +
                ", netvalue='" + netvalue + '\'' +
                ", pstaus='" + pstaus + '\'' +
                ", company='" + company + '\'' +
                ", grade='" + grade + '\'' +
                ", organization='" + organization + '\'' +
                ", trustee='" + trustee + '\'' +
                ", adviser='" + adviser + '\'' +
                ", broker='" + broker + '\'' +
                ", pdeadline='" + pdeadline + '\'' +
                ", lineof='" + lineof + '\'' +
                ", lossline='" + lossline + '\'' +
                ", signingperiod='" + signingperiod + '\'' +
                ", enddate='" + enddate + '\'' +
                ", currency='" + currency + '\'' +
                ", financing='" + financing + '\'' +
                ", financingname='" + financingname + '\'' +
                ", raiseway='" + raiseway + '\'' +
                ", payment='" + payment + '\'' +
                ", reservationstart='" + reservationstart + '\'' +
                ", reservationend='" + reservationend + '\'' +
                ", currentnetworth='" + currentnetworth + '\'' +
                ", frequency='" + frequency + '\'' +
                ", phighlights='" + phighlights + '\'' +
                ", mobility='" + mobility + '\'' +
                ", joinmoney='" + joinmoney + '\'' +
                ", coststructure='" + coststructure + '\'' +
                ", distribution='" + distribution + '\'' +
                ", pdetail='" + pdetail + '\'' +
                ", pevaluation='" + pevaluation + '\'' +
                ", pmaterial='" + pmaterial + '\'' +
                ", goals='" + goals + '\'' +
                ", investmentscope='" + investmentscope + '\'' +
                ", redundancyone='" + redundancyone + '\'' +
                ", redundancytwo='" + redundancytwo + '\'' +
                ", redundancythr='" + redundancythr + '\'' +
                ", ptype='" + ptype + '\'' +
                ", riskgrade='" + riskgrade + '\'' +
                ", biddeadline='" + biddeadline + '\'' +
                ", prodel=" + prodel +
                ", orderlist=" + orderlist +
                '}';
    }

    public void setOrderlist(Orderlist orderlist) {
        this.orderlist = orderlist;
    }

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getMpid() {
        return mpid;
    }

    public void setMpid(Integer mpid) {
        this.mpid = mpid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getPstart() {
        return pstart;
    }

    public void setPstart(String pstart) {
        this.pstart = pstart == null ? null : pstart.trim();
    }

    public String getPlimit() {
        return plimit;
    }

    public void setPlimit(String plimit) {
        this.plimit = plimit == null ? null : plimit.trim();
    }

    public String getPearnings() {
        return pearnings;
    }

    public void setPearnings(String pearnings) {
        this.pearnings = pearnings == null ? null : pearnings.trim();
    }

    public String getNetvalue() {
        return netvalue;
    }

    public void setNetvalue(String netvalue) {
        this.netvalue = netvalue == null ? null : netvalue.trim();
    }

    public String getPstaus() {
        return pstaus;
    }

    public void setPstaus(String pstaus) {
        this.pstaus = pstaus == null ? null : pstaus.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getTrustee() {
        return trustee;
    }

    public void setTrustee(String trustee) {
        this.trustee = trustee == null ? null : trustee.trim();
    }

    public String getAdviser() {
        return adviser;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser == null ? null : adviser.trim();
    }

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker == null ? null : broker.trim();
    }

    public String getPdeadline() {
        return pdeadline;
    }

    public void setPdeadline(String pdeadline) {
        this.pdeadline = pdeadline == null ? null : pdeadline.trim();
    }

    public String getLineof() {
        return lineof;
    }

    public void setLineof(String lineof) {
        this.lineof = lineof == null ? null : lineof.trim();
    }

    public String getLossline() {
        return lossline;
    }

    public void setLossline(String lossline) {
        this.lossline = lossline == null ? null : lossline.trim();
    }

    public String getSigningperiod() {
        return signingperiod;
    }

    public void setSigningperiod(String signingperiod) {
        this.signingperiod = signingperiod == null ? null : signingperiod.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getFinancing() {
        return financing;
    }

    public void setFinancing(String financing) {
        this.financing = financing == null ? null : financing.trim();
    }

    public String getFinancingname() {
        return financingname;
    }

    public void setFinancingname(String financingname) {
        this.financingname = financingname == null ? null : financingname.trim();
    }

    public String getRaiseway() {
        return raiseway;
    }

    public void setRaiseway(String raiseway) {
        this.raiseway = raiseway == null ? null : raiseway.trim();
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public String getReservationstart() {
        return reservationstart;
    }

    public void setReservationstart(String reservationstart) {
        this.reservationstart = reservationstart == null ? null : reservationstart.trim();
    }

    public String getReservationend() {
        return reservationend;
    }

    public void setReservationend(String reservationend) {
        this.reservationend = reservationend == null ? null : reservationend.trim();
    }

    public String getCurrentnetworth() {
        return currentnetworth;
    }

    public void setCurrentnetworth(String currentnetworth) {
        this.currentnetworth = currentnetworth == null ? null : currentnetworth.trim();
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public String getPhighlights() {
        return phighlights;
    }

    public void setPhighlights(String phighlights) {
        this.phighlights = phighlights == null ? null : phighlights.trim();
    }

    public String getMobility() {
        return mobility;
    }

    public void setMobility(String mobility) {
        this.mobility = mobility == null ? null : mobility.trim();
    }

    public String getJoinmoney() {
        return joinmoney;
    }

    public void setJoinmoney(String joinmoney) {
        this.joinmoney = joinmoney == null ? null : joinmoney.trim();
    }

    public String getCoststructure() {
        return coststructure;
    }

    public void setCoststructure(String coststructure) {
        this.coststructure = coststructure == null ? null : coststructure.trim();
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution == null ? null : distribution.trim();
    }

    public String getPdetail() {
        return pdetail;
    }

    public void setPdetail(String pdetail) {
        this.pdetail = pdetail == null ? null : pdetail.trim();
    }

    public String getPevaluation() {
        return pevaluation;
    }

    public void setPevaluation(String pevaluation) {
        this.pevaluation = pevaluation == null ? null : pevaluation.trim();
    }

    public String getPmaterial() {
        return pmaterial;
    }

    public void setPmaterial(String pmaterial) {
        this.pmaterial = pmaterial == null ? null : pmaterial.trim();
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals == null ? null : goals.trim();
    }

    public String getInvestmentscope() {
        return investmentscope;
    }

    public void setInvestmentscope(String investmentscope) {
        this.investmentscope = investmentscope == null ? null : investmentscope.trim();
    }

    public String getRedundancyone() {
        return redundancyone;
    }

    public void setRedundancyone(String redundancyone) {
        this.redundancyone = redundancyone == null ? null : redundancyone.trim();
    }

    public String getRedundancytwo() {
        return redundancytwo;
    }

    public void setRedundancytwo(String redundancytwo) {
        this.redundancytwo = redundancytwo == null ? null : redundancytwo.trim();
    }

    public String getRedundancythr() {
        return redundancythr;
    }

    public void setRedundancythr(String redundancythr) {
        this.redundancythr = redundancythr == null ? null : redundancythr.trim();
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }

    public String getRiskgrade() {
        return riskgrade;
    }

    public void setRiskgrade(String riskgrade) {
        this.riskgrade = riskgrade == null ? null : riskgrade.trim();
    }

    public String getBiddeadline() {
        return biddeadline;
    }

    public void setBiddeadline(String biddeadline) {
        this.biddeadline = biddeadline == null ? null : biddeadline.trim();
    }

    public Integer getProdel() {
        return prodel;
    }

    public void setProdel(Integer prodel) {
        this.prodel = prodel;
    }

}