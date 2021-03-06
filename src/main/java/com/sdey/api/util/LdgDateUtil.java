package com.sdey.api.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by LiuDongguang on 2017/11/6.
 */
public class LdgDateUtil {
    private final static String yyyy_mm_dd_hh_mm_ss = "yyyy-MM-dd HH:mm:ss";
    private final static String yyyy_mm_dd_hh_mm = "yyyy-MM-dd HH:mm";
    private final static String yyyy_mm_dd_hh = "yyyy-MM-dd HH";
    private final static String yyyy_mm_dd = "yyyy-MM-dd";
    public static final SimpleDateFormat yyyy_MM_dd_HH_mmFormat = new SimpleDateFormat(yyyy_mm_dd_hh_mm);
    private final static ZoneId zoneId = ZoneId.systemDefault();
    private final static String yyyy_mm_dd_00_00_00 = "yyyy-MM-dd 00:00:00";
    private final static String yyyy_mm_dd_23_59_59 = "yyyy-MM-dd 23:59:59";
    private final static String yyyy_mm_dd_HH_00_00 = "yyyy-MM-dd HH:00:00";
    private final static String  zhongwen_yyyyMM="yyyy年MM月";
    private final static String  zhongwen_MM="MM月";
    private final static String  zhongwen_yyyy="yyyy年";
    private final static String HH = "HH";
    private final static String zhongwen_dd = "dd号";
    public final static DateTimeFormatter newDateFormat_yyyy_mm_dd_HH_00_00 = DateTimeFormatter.ofPattern(yyyy_mm_dd_HH_00_00);
    public final static DateTimeFormatter newDateFormat_yyyy_mm_dd_HH_mm_ss = DateTimeFormatter.ofPattern(yyyy_mm_dd_hh_mm_ss);
    public final static DateTimeFormatter newDateFormat_yyyy_mm_dd_00_00_00 = DateTimeFormatter.ofPattern(yyyy_mm_dd_00_00_00);
    public final static DateTimeFormatter newDateFormat_yyyy_mm_dd_23_59_59 = DateTimeFormatter.ofPattern(yyyy_mm_dd_23_59_59);

    public static String getyyyy_mm_dd_HH_00_00String(Date date) {
        return DateFormatUtils.format(date, yyyy_mm_dd_HH_00_00);
    }

    public static String getyyyy_mm_dd_00_00_00String(Date date) {
        return DateFormatUtils.format(date, yyyy_mm_dd_00_00_00);
    }

    public static Date getyyyy_mm_dd_00_00_00Date(String dateStr) throws ParseException {
        return DateUtils.parseDate(dateStr, yyyy_mm_dd_00_00_00);
    }

    public static String getYyyy_mm_dd_hh_mm_ssString(Date date) {
        return DateFormatUtils.format(date, yyyy_mm_dd_hh_mm_ss);
    }

    public static Date getYyyy_mm_dd_hh_mm_ssDate(String dateStr) throws ParseException {
        return DateUtils.parseDate(dateStr, yyyy_mm_dd_hh_mm_ss);
    }

    public static String getYyyy_mm_ddString(Date date) {
        return DateFormatUtils.format(date, yyyy_mm_dd);
    }

    public static Date getYyyy_mm_ddDate(String dateStr) throws ParseException {
        return DateUtils.parseDate(dateStr, yyyy_mm_dd);
    }
    public static Date getyyyy_mm_dd_hh_mmDate(String dateStr) throws ParseException {
        return DateUtils.parseDate(dateStr, yyyy_mm_dd_hh_mm);
    }
    public static String getYyyy_mm_ddDateStr(Date date) throws ParseException {
        return DateFormatUtils.format(date, yyyy_mm_dd);
    }

    public static String getyyyy_mm_dd_hhString(Date date) {
        return DateFormatUtils.format(date, yyyy_mm_dd_hh);
    }

    public static Date getyyyy_mm_dd_hhDate(String dateStr) throws ParseException {
        return DateUtils.parseDate(dateStr, yyyy_mm_dd_hh);
    }

    public static Date parseLocalDateToDate(LocalDate localDate) {
        ZonedDateTime zdt = localDate.atStartOfDay(zoneId);
        Date date = Date.from(zdt.toInstant());
        return date;
    }

    public static LocalDate parseDateToLocalDate(Date date) {
        Instant instant = date.toInstant();
        LocalDate localDate = instant.atZone(zoneId).toLocalDate();
        return localDate;
    }

    public static LocalDateTime parseDateToLocalDateTime(Date date) {
        Instant instant = date.toInstant();
        LocalDateTime localDate = instant.atZone(zoneId).toLocalDateTime();
        return localDate;
    }

    public static List<Date> getDateByBetween(Date start, Date end) {
        List<Date> listDate = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(end);
        LocalDate newstart = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
        LocalDate newend = LocalDate.of(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH) + 1, calendar2.get(Calendar.DAY_OF_MONTH));
        if (newstart.isAfter(newend)) {
            System.out.println("开始时间不能在结束时间之后");
            return null;
        }
        while (true) {
            if (newstart.isBefore(newend)) {
                listDate.add(parseLocalDateToDate(newstart));
                newstart = newstart.plusDays(1);
            } else {
                break;
            }
        }
        listDate.add(parseLocalDateToDate(newstart));//包含结尾时间
        return listDate;
    }

    public static Date getDayZeroTime(Date date) throws ParseException {
        String str = DateFormatUtils.format(date, yyyy_mm_dd_00_00_00);
        return DateUtils.parseDate(str, yyyy_mm_dd_hh_mm_ss);
    }

    public static Date getDayLastTime(Date date) throws ParseException {
        String str = DateFormatUtils.format(date, yyyy_mm_dd_23_59_59);
        return DateUtils.parseDate(str, yyyy_mm_dd_hh_mm_ss);
    }
    public static Date getDayZeroTime(LocalDateTime date) throws ParseException {
        String str = date.format(newDateFormat_yyyy_mm_dd_00_00_00);
        return DateUtils.parseDate(str, yyyy_mm_dd_hh_mm_ss);
    }

    public static Date getDayLastTime(LocalDateTime date) throws ParseException {
        String str = date.format(newDateFormat_yyyy_mm_dd_23_59_59);
        return DateUtils.parseDate(str, yyyy_mm_dd_hh_mm_ss);
    }
    public static Date get000000Time(Date date) throws ParseException {
        String str = DateFormatUtils.format(date, yyyy_mm_dd_00_00_00);
        return DateUtils.parseDate(str, yyyy_mm_dd_hh_mm_ss);
    }

    public static Date get235959Time(Date date) throws ParseException {
        String str = DateFormatUtils.format(date, yyyy_mm_dd_23_59_59);
        return DateUtils.parseDate(str, yyyy_mm_dd_hh_mm_ss);
    }

    /**
     * 获取给定时间，小时的数字
     *
     * @param handledate
     * @return
     */
    public static Integer getHourNum(Date handledate) {
        String hh = DateFormatUtils.format(handledate, HH);
        return Integer.valueOf(hh);
    }
    public static String getDayZhongwen(Date handledate) {
        String day = DateFormatUtils.format(handledate, zhongwen_dd);
        return day;
    }

    /**
     * 给定小时，返回当前时间 0分 0秒的时间
     *
     * @param h
     * @return
     */
    public static Long getTimeByHH(Integer h) {
        LocalDateTime lct = LocalDateTime.now();
        LocalDateTime getlct = LocalDateTime.of(lct.getYear(), lct.getMonth(), lct.getDayOfMonth(), h, 0, 0);
        return getlct.atZone(zoneId).toInstant().toEpochMilli();
    }


    /**
     * yyyy年mm月
     * @param date
     * @return
     */
    public static String get_zhongwen_yyyyMM(Date date) {
        return DateFormatUtils.format(date, zhongwen_yyyyMM);
    }

    /**
     * mm月
     * @param handledate
     * @return
     */
    public static String getMonthHanzi(Date handledate) {
        return DateFormatUtils.format(handledate, zhongwen_MM);
    }
    /**
     * mm月
     * @param handledate
     * @return
     */
    public static String getYearHanzi(Date handledate) {
        return DateFormatUtils.format(handledate, zhongwen_yyyy);
    }



    public static long getAgeByDate(Date birthday) {
        LocalDate now=LocalDate.now();
        LocalDate localDateBirthday=parseDateToLocalDate(birthday);
        long yearsDiff = ChronoUnit.YEARS.between(localDateBirthday, now);
        return yearsDiff;
    }
}
