package com.ntp.taskmanager;


public interface Completable {

   
    void complete();

    /**
     * Nesnenin tamamlanıp tamamlanmadığını döndürür.
     *
     * @return true ise tamamlanmıştır, false ise tamamlanmamıştır
     */
    boolean isCompleted();
}
