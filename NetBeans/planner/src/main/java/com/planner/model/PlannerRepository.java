package com.planner.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Repository untuk menyimpan dan mengelola semua ScheduleItem.
 * Konsep OOP: Encapsulation, Generic Collection (ArrayList<T>)
 */
public class PlannerRepository {

    // Generic collection - salah satu konsep koleksi PBO P09
    private final List<ScheduleItem> items = new ArrayList<>();

    // Singleton pattern (optional extra OOP concept)
    private static PlannerRepository instance;

    private PlannerRepository() {
        seedData();
    }

    public static PlannerRepository getInstance() {
        if (instance == null) {
            instance = new PlannerRepository();
        }
        return instance;
    }

    public void add(ScheduleItem item) {
        items.add(item);
    }

    public void remove(ScheduleItem item) {
        items.remove(item);
    }

    public void update(ScheduleItem item) {
        // Karena kita pakai referensi, update otomatis tercermin
    }

    public List<ScheduleItem> getAll() {
        List<ScheduleItem> sorted = new ArrayList<>(items);
        Collections.sort(sorted); // Pakai Comparable dari ScheduleItem
        return sorted;
    }

    public List<ScheduleItem> getByDate(LocalDate date) {
        return items.stream()
                .filter(item -> item.getDate().equals(date))
                .sorted()
                .collect(Collectors.toList());
    }

    public List<TodoItem> getAllTodos() {
        return items.stream()
                .filter(item -> item instanceof TodoItem)
                .map(item -> (TodoItem) item)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<EventItem> getAllEvents() {
        return items.stream()
                .filter(item -> item instanceof EventItem)
                .map(item -> (EventItem) item)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<ScheduleItem> getUpcoming(int days) {
        LocalDate today = LocalDate.now();
        LocalDate until = today.plusDays(days);
        return items.stream()
                .filter(item -> !item.getDate().isBefore(today) && !item.getDate().isAfter(until))
                .sorted()
                .collect(Collectors.toList());
    }

    public boolean hasItemsOnDate(LocalDate date) {
        return items.stream().anyMatch(item -> item.getDate().equals(date));
    }

    public boolean hasTodoOnDate(LocalDate date) {
        return items.stream().anyMatch(item -> item.getDate().equals(date) && item instanceof TodoItem);
    }

    public boolean hasEventOnDate(LocalDate date) {
        return items.stream().anyMatch(item -> item.getDate().equals(date) && item instanceof EventItem);
    }

    public int countTodos() {
        return (int) items.stream().filter(i -> i instanceof TodoItem).count();
    }

    public int countEvents() {
        return (int) items.stream().filter(i -> i instanceof EventItem).count();
    }

    public int countDoneTodos() {
        return (int) items.stream()
                .filter(i -> i instanceof TodoItem && ((TodoItem) i).isDone())
                .count();
    }

    // Data awal / contoh
    private void seedData() {
        LocalDate today = LocalDate.now();
        add(new TodoItem("Buat class diagram UML", today, "Sebelum mulai coding"));
        add(new TodoItem("Push code ke GitHub", today.plusDays(2), "Commit semua perubahan", TodoItem.Priority.HIGH));
        add(new EventItem("Presentasi PBO Kelompok", today.plusDays(1), "Persiapan 5 menit",
                java.time.LocalTime.of(9, 0), "Ruang B101"));
        add(new TodoItem("Review materi Polimorfisme", today.plusDays(4), "Baca slide P07"));
        add(new EventItem("UAS Pemrograman Berorientasi Objek", today.plusDays(17), "Bawa kartu ujian",
                java.time.LocalTime.of(8, 0), "Gedung C"));
        add(new TodoItem("Finalisasi laporan PBO", today.plusDays(16), "Format PDF", TodoItem.Priority.HIGH));
    }
}
