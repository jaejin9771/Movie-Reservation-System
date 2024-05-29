/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.moviereservationsystem.Repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 이 클래스는 텍스트 파일을 사용하여 T 타입의 객체를 관리
 *
 * @author jaejin
 */
public abstract class CrudRepository<T> {

    private final String filePath; // 파일 경로를 저장하는 변수

    // 생성자는 파일 경로를 인자로 받음
    public CrudRepository(String filePath) {
        this.filePath = filePath;
    }

    // 문자열을 T 타입 객체로 변환하는 추상 메소드
    protected abstract T fromString(String str);

    // T 타입 객체를 문자열로 변환하는 추상 메소드
    protected abstract String toString(T item);

    /**
     * 새로운 객체를 파일에 추가
     * @param item 파일에 추가할 객체
     */
    
    public T create(T item) {
        try (FileWriter fw = new FileWriter(filePath, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
            out.println(toString(item)); // 객체를 문자열로 변환하여 파일에 쓰기
            System.out.println("데이터 등록 성공!");
            return item;
        } catch (IOException e) {
            System.err.println("파일 쓰기 중 오류 발생: " + e.getMessage());
            return null;
        }
    }

    /**
     * 파일의 모든 줄을 읽어서 T 타입 객체의 리스트로 반환
     * @return T 타입 객체의 리스트
     */
    
    public List<T> readAll() {
        List<T> items = new ArrayList<>();
        try (FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                items.add(fromString(line)); // 문자열을 객체로 변환하여 리스트에 추가
            }
        } catch (IOException e) {
            System.err.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }
        return items;
    }
    
    /**
     * 데이터를 수정
     * @param oldItem 수정할 객체
     * @param newItem 새로 쓸 객체
     */
    public void update(T oldItem, T newItem) {
        List<T> items = readAll(); // 현재 파일의 모든 객체를 읽어옴
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(oldItem)) {
                items.set(i, newItem); // 해당 객체를 새 객체로 교체
                break; // 객체를 찾았으면 루프 종료
            }
        }
        rewriteFile(items); // 변경된 리스트를 파일에 다시 쓰기
    }

    /**
     * 파일에서 데이터를 삭제한다.
     *
     * @param item 삭제할 객체
     *
     */
    
    public void delete(T item) {
        List<T> items = readAll(); // 현재 파일의 모든 객체를 읽어옴
        items.removeIf(existingItem -> existingItem.equals(item)); // equals()를 사용하여 객체 비교 후 삭제
        rewriteFile(items); // 변경된 리스트를 파일에 다시 쓰기
    }

    /**
     * 주어진 리스트의 객체를 파일에 다시 쓰는데 사용
     * @param items 다시 쓸 T타입 객체의 리스트
     */
    private void rewriteFile(List<T> items) {
        try (FileWriter fw = new FileWriter(filePath, false); BufferedWriter bw = new BufferedWriter(fw)) {
            for (T item : items) {
                bw.write(toString(item)); // 객체를 문자열로 변환하여 파일에 쓰기
                bw.newLine(); // 줄바꿈
            }
        } catch (IOException e) {
            System.err.println("파일 재쓰기 중 오류 발생: " + e.getMessage());
        }
    }
    
    public List<String[]> readAlltoString() {
        List<String[]> item = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] movie = line.split(","); // Split the TXT line by commas
                item.add(movie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return item;
    }

    public String getFilePath() {
        return filePath;
    }
    
}
