package com.training.cleanarchitecturenotesapp.business.domain.util;

import com.google.firebase.Timestamp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Singleton;

@Singleton
public class DateUtil {

    private SimpleDateFormat simpleDateFormat;

    public DateUtil(SimpleDateFormat simpleDateFormat) {
        this.simpleDateFormat = simpleDateFormat;
    }

    public String removeTimeFromDateString(String string) {
        return string.substring(0, string.indexOf(" "));
    }

    public String convertFirebaseTimestampToStringData(Timestamp timestamp) {
        return simpleDateFormat.format(timestamp.toDate());
    }

    // Date format: "2019-07-23 HH:mm:ss"
    public Timestamp convertStringDateToFirebaseTimestamp(String date) {
        try {
            return new Timestamp(simpleDateFormat.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    // dates format looks like this: "2019-07-23 HH:mm:ss"
    public String getCurrentTimestamp()  {
        return simpleDateFormat.format(new Date());
    }
}
