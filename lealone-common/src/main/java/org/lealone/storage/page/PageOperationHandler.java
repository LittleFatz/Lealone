/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.storage.page;

public interface PageOperationHandler {

    long getLoad();

    void handlePageOperation(PageOperation po);

    void addWaitingHandler(PageOperationHandler handler);

    void wakeUpWaitingHandlers();

    void wakeUp();

}
