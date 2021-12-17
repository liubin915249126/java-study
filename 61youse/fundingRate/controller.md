## fundingRate

fundingRateController.listFundingRate--fundingRateDtoMapper-->fundingRateService.listFundingRates

- fop-web/fundingRateController
  接口的入口
- fop-service/fundingRateService
  服务定义
- fop-service/impl/fundingRateServiceImpl
  服务的具体实现
- fop-dal/fundingRateRepository
  与数据库交互
  FopFundingRateDao.ctx().selectFrom(FOP_FUNDING_RATE).where(FOP_FUNDING_RATE.STATUS
                .eq(status.name()).and(symbolNameEq)  