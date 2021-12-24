List<com.bybit.fop.dal.jooq.fundingrate.tables.pojos.FopFundingRate> fopFundingRates = FopFundingRateDao.ctx().selectFrom(FOP_FUNDING_RATE).where(FundingRateParamEnum.released.equals(status)  ? FOP_FUNDING_RATE.STATUS
                .eq(status.name()) : DSL.noCondition()).fetch(FopFundingRateDao.mapper());

#### 同步表
```sql
insert into b(col1, col2, col3, …) select a.col1, a.col2, a.col3, … from a where …;
insert into fop_funding_rate(
  'symbol_id', 'symbol_name', 'symbol_no'
) select fop_symbol.id, fop_symbol.symbol_name, fop_symbol.symbol_no from fop_symbol where status ==='allReleased';
```

```sql
insert into fop.fop_funding_rate
(symbol_id, `symbol_name`, symbol_no, funding_rate_get_interval, funding_rate_cap, funding_rate_adjustment_param)
select fop_symbol.id, fop_symbol.symbol_name, fop_symbol.symbol_no,
       480,CASE fop_symbol.symbol_name
               WHEN 'BTCUSDT' THEN '0.375'
               WHEN (
                       'ETHUSDT'  |
                       'BCHUSDT'  |
                       'LTCUSDT'  |
                       'XRPUSDT'  |
                       'EOSUSDT'  |
                       'BNBUSDT'  |
                       'BITUSDT'
                   ) THEN '0.75'
               ELSE
                   '1.5'
           END
           as funding_rate_cap,'75'
from fop.fop_symbol where status ='allReleased';
```

- 只复制表结构到新表
CREATE TABLE fop_funding_rate_bak SELECT * FROM fop_funding_rate
create table fop_funding_rate_bak like fop_funding_rate
insert into fop_funding_rate_bak select *from fop_funding_rate

CREATE TABLE 新表 SELECT * FROM 旧表 WHERE 1=2
或CREATE TABLE 新表  LIKE 旧表

#### 修改类型
ALTER TABLE RRR1 MODIFY COLUMN R1 VARCHAR(3);

#### UPDATE
UPDATE fop_funding_rate SET funding_rate_get_interval = 8 WHERE funding_rate_get_interval = 480 
#### ADD
alter table table1 add transactor varchar(10) not Null;

alter table fop_airdrop_config add main_color varchar(20) not Null,
add get_button_color varchar(20) not Null,
add big_banner varchar(200) not Null,
add middle_banner varchar(200) not Null,
add small_banner varchar(200) not Null,
add app_link varchar(200) not Null;

alter table table1 add id int unsigned not Null auto_increment primary key


#### 
alter table fop_airdrop_config add user_rule varchar(500) not Null DEFAULT '' COMMENT '用户规则'
alter table fop_airdrop_config modify user_rule varchar(5000)