package org.kloc.recursion;
import java.util.*;
import java.lang.reflect.Field;
public class KnightShortestMoves {
	    public static int KnightShortestMoves(String start, String end) {
	        int[] startPoint = convertToPoint(start);
	        int[] endPoint = convertToPoint(end);
	        Map<String, Integer> chessBoard = new HashMap<>();
	        chessBoard.put(Arrays.toString(startPoint), 0);
	        Queue<int[]> q = new LinkedList<>();
	        q.add(startPoint);
	        while (!(q.peek()[0] == endPoint[0] && q.peek()[1] == endPoint[1])) {
	            int[] point = q.poll();
	            List<int[]> moves = checkMoves(getMoves(point));
	            for (int[] move : moves) {
	                q.add(move);
	                chessBoard.put(Arrays.toString(move), chessBoard.get(Arrays.toString(point)) + 1);
	            }
	        }
	        return chessBoard.get(Arrays.toString(endPoint));
	    }

	    public static int[] convertToPoint(String i) {
	        Map<Character, Integer> columns = new HashMap<>();
	        columns.put('a', 1);
	        columns.put('b', 2);
	        columns.put('c', 3);
	        columns.put('d', 4);
	        columns.put('e', 5);
	        columns.put('f', 6);
	        columns.put('g', 7);
	        columns.put('h', 8);
	        int first = Integer.parseInt(i.substring(1));
	        int second = columns.get(i.charAt(0));
	        return new int[]{first, second};
	    }

	    public static int[][] getMoves(int[] point) {
	        int[][] moves = new int[8][2];
	        moves[0] = new int[]{point[0] + 1, point[1] - 2};
	        moves[1] = new int[]{point[0] + 1, point[1] + 2};
	        moves[2] = new int[]{point[0] - 1, point[1] - 2};
	        moves[3] = new int[]{point[0] - 1, point[1] + 2};
	        moves[4] = new int[]{point[0] + 2, point[1] - 1};
	        moves[5] = new int[]{point[0] + 2, point[1] + 1};
	        moves[6] = new int[]{point[0] - 2, point[1] - 1};
	        moves[7] = new int[]{point[0] - 2, point[1] + 1};
	        return moves;
	    }

	    public static List<int[]> checkMoves(int[][] moves) {
	        List<int[]> validMoves = new ArrayList<>();
	        for (int[] move : moves) {
	            if (move[0] >= 1 && move[0] <= 8 && move[1] >= 1 && move[1] <= 8) {
	                validMoves.add(move);
	            }
	        }
	        return validMoves;
	    }

	    public static void main(String[] args) {
	        System.out.println(KnightShortestMoves("a3", "d6"));
	    }
	}

