package ru.exdata.moex.component.urlbuilder.pathmap.engines.market.boardgroup.security;

import ru.exdata.moex.component.urlbuilder.Format;
import ru.exdata.moex.component.urlbuilder.Query;

public final class Orderbook {
    private final Security security;
    private final Query query;

    Orderbook(Security security, final Query query) {
        this.security = security;
        this.query = query;
    }

    /**
     * <a href="https://iss.moex.com/iss/reference/59">Получить лучшие заявки выбранного инструмента, торгуемого на выбранной группе режимов торгов.</a>
     */
    public Format format() {
        return new Format(security.securities.boardgroup.boardgroups.market.markets.engine.engines.iss.issClient.httpClient, security.securities.boardgroup.boardgroups.market.markets.engine.engines.iss.issClient.uri, this.query);
    }
}