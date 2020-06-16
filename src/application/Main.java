package application;
	
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	
	Integer r = 0;
	
	Label display;
	Button zero;
	Button one;
	Button two;
	Button three;
	Button four;
	Button five;
	Button six;
	Button seven;
	Button eight;
	Button nine;
	Button add;
	Button sub;
	Button mul;
	Button div;
	Button ce;
	Button comma;
	Button equal;
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("CALCULATOR");
			display = new Label("0");
			display.setStyle("-fx-font-size: 15pt;");
			
			GridPane root = new GridPane();
			root.setPadding(new Insets(25));
			root.setHgap(5);
		    root.setVgap(5);
		    
		    Scene scene = new Scene(root, 220, 320);
			primaryStage.setScene(scene);
			
			ScriptEngineManager mgr = new ScriptEngineManager();
		    ScriptEngine eng = mgr.getEngineByName("JavaScript");
			

			one = new Button("1");
			one.setStyle("-fx-font-size: 15pt;");
			one.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					
					if(display.getText() == "0") {
						display.setText("1");
					}
					
//					else if(r == 0) {
//						display.setText(display.getText()+"1");
//					}
					else {
						display.setText(display.getText()+"1");
					}
					
					if(display.getText().length() >= 13) {
						one.setDisable(true);
						two.setDisable(true);
						three.setDisable(true);
						four.setDisable(true);
						five.setDisable(true);
						six.setDisable(true);
						seven.setDisable(true);
						eight.setDisable(true);
						nine.setDisable(true);
						zero.setDisable(true);
						comma.setDisable(true);
					}
					add.setDisable(false);
					sub.setDisable(false);
					mul.setDisable(false);
					div.setDisable(false);
					zero.setDisable(false);
					
				}
				
			});
			
			two = new Button("2");
			two.setStyle("-fx-font-size: 15pt;");
			two.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() == "0") {
						display.setText("2");
					}
					
					else {
						display.setText(display.getText()+"2");
					}
//					else {
//						display.setText("2");
//					}
					
					if(display.getText().length() >= 13) {
						one.setDisable(true);
						two.setDisable(true);
						three.setDisable(true);
						four.setDisable(true);
						five.setDisable(true);
						six.setDisable(true);
						seven.setDisable(true);
						eight.setDisable(true);
						nine.setDisable(true);
						zero.setDisable(true);
						comma.setDisable(true);
					}
					add.setDisable(false);
					sub.setDisable(false);
					mul.setDisable(false);
					div.setDisable(false);
					zero.setDisable(false);
				}
				
			});
			
			three = new Button("3");
			three.setStyle("-fx-font-size: 15pt;");
			three.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() == "0") {
						display.setText("3");
					}
					
					else {
						display.setText(display.getText()+"3");
					}
//					else {
//						display.setText("3");
//					}
					
					if(display.getText().length() >= 13) {
						one.setDisable(true);
						two.setDisable(true);
						three.setDisable(true);
						four.setDisable(true);
						five.setDisable(true);
						six.setDisable(true);
						seven.setDisable(true);
						eight.setDisable(true);
						nine.setDisable(true);
						zero.setDisable(true);
						comma.setDisable(true);
					}
					add.setDisable(false);
					sub.setDisable(false);
					mul.setDisable(false);
					div.setDisable(false);
					zero.setDisable(false);
				}
				
			});
			
			four = new Button("4");
			four.setStyle("-fx-font-size: 15pt;");
			four.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() == "0") {
						display.setText("4");
					}
					
					else {
						display.setText(display.getText()+"4");
					}
//					else {
//						display.setText("4");
//					}
					
					if(display.getText().length() >= 13) {
						one.setDisable(true);
						two.setDisable(true);
						three.setDisable(true);
						four.setDisable(true);
						five.setDisable(true);
						six.setDisable(true);
						seven.setDisable(true);
						eight.setDisable(true);
						nine.setDisable(true);
						zero.setDisable(true);
						comma.setDisable(true);
					}
					add.setDisable(false);
					sub.setDisable(false);
					mul.setDisable(false);
					div.setDisable(false);
					zero.setDisable(false);
				}
				
			});
			
			five = new Button("5");
			five.setStyle("-fx-font-size: 15pt;");
			five.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() == "0") {
						display.setText("5");
					}
					
					else {
						display.setText(display.getText()+"5");
					}
//					else {
//						display.setText("5");
//					}
					
					if(display.getText().length() >= 13) {
						one.setDisable(true);
						two.setDisable(true);
						three.setDisable(true);
						four.setDisable(true);
						five.setDisable(true);
						six.setDisable(true);
						seven.setDisable(true);
						eight.setDisable(true);
						nine.setDisable(true);
						zero.setDisable(true);
						comma.setDisable(true);
					}
					add.setDisable(false);
					sub.setDisable(false);
					mul.setDisable(false);
					div.setDisable(false);
					zero.setDisable(false);
				}
				
			});
			
			six = new Button("6");
			six.setStyle("-fx-font-size: 15pt;");
			six.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() == "0") {
						display.setText("6");
					}
					
					else {
						display.setText(display.getText()+"6");
					}
//					else {
//						display.setText("6");
//					}
					
					if(display.getText().length() >= 13) {
						one.setDisable(true);
						two.setDisable(true);
						three.setDisable(true);
						four.setDisable(true);
						five.setDisable(true);
						six.setDisable(true);
						seven.setDisable(true);
						eight.setDisable(true);
						nine.setDisable(true);
						zero.setDisable(true);
						comma.setDisable(true);
					}
					add.setDisable(false);
					sub.setDisable(false);
					mul.setDisable(false);
					div.setDisable(false);
					zero.setDisable(false);
				}
				
			});
			
			seven = new Button("7");
			seven.setStyle("-fx-font-size: 15pt;");
			seven.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() == "0") {
						display.setText("7");
					}
					
					else {
						display.setText(display.getText()+"7");
					}
//					else {
//						display.setText("7");
//					}
					
					if(display.getText().length() >= 13) {
						one.setDisable(true);
						two.setDisable(true);
						three.setDisable(true);
						four.setDisable(true);
						five.setDisable(true);
						six.setDisable(true);
						seven.setDisable(true);
						eight.setDisable(true);
						nine.setDisable(true);
						zero.setDisable(true);
						comma.setDisable(true);
					}
					add.setDisable(false);
					sub.setDisable(false);
					mul.setDisable(false);
					div.setDisable(false);
					zero.setDisable(false);
				}
				
			});
			
			eight = new Button("8");
			eight.setStyle("-fx-font-size: 15pt;");
			eight.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() == "0") {
						display.setText("8");
					}
					
					else {
						display.setText(display.getText()+"8");
					}
//					else {
//						display.setText("8");
//					}
					
					if(display.getText().length() >= 13) {
						one.setDisable(true);
						two.setDisable(true);
						three.setDisable(true);
						four.setDisable(true);
						five.setDisable(true);
						six.setDisable(true);
						seven.setDisable(true);
						eight.setDisable(true);
						nine.setDisable(true);
						zero.setDisable(true);
						comma.setDisable(true);
					}
					add.setDisable(false);
					sub.setDisable(false);
					mul.setDisable(false);
					div.setDisable(false);
					zero.setDisable(false);
				}
				
			});
			
			nine = new Button("9");
			nine.setStyle("-fx-font-size: 15pt;");
			nine.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() == "0") {
						display.setText("9");
					}
					
					else {
						display.setText(display.getText()+"9");
					}
//					else {
//						display.setText("9");
//					}
					
					if(display.getText().length() >= 13) {
						one.setDisable(true);
						two.setDisable(true);
						three.setDisable(true);
						four.setDisable(true);
						five.setDisable(true);
						six.setDisable(true);
						seven.setDisable(true);
						eight.setDisable(true);
						nine.setDisable(true);
						zero.setDisable(true);
						comma.setDisable(true);
					}
					add.setDisable(false);
					sub.setDisable(false);
					mul.setDisable(false);
					div.setDisable(false);
					zero.setDisable(false);
				}
				
			});
			
			zero = new Button("0");
			zero.setStyle("-fx-font-size: 15pt;");
			zero.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() == "0") {
						display.setText("0");
					}
					
					else {
						display.setText(display.getText()+"0");
					}
//					else {
//						display.setText("0");
//					}
					
					if(display.getText().length() >= 13) {
						one.setDisable(true);
						two.setDisable(true);
						three.setDisable(true);
						four.setDisable(true);
						five.setDisable(true);
						six.setDisable(true);
						seven.setDisable(true);
						eight.setDisable(true);
						nine.setDisable(true);
						zero.setDisable(true);
						comma.setDisable(true);
					}
					add.setDisable(false);
					sub.setDisable(false);
					mul.setDisable(false);
					div.setDisable(false);
					zero.setDisable(false);
				}
				
			});
			
			ce = new Button("CE");
			ce.setStyle("-fx-font-size: 15pt;");
			ce.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					
					add.setDisable(false);
					sub.setDisable(false);
					mul.setDisable(false);
					div.setDisable(false);
					zero.setDisable(false);
					display.setText("0");
					r = 0;
				}
				
			});
			
			equal = new Button("=");
			equal.setStyle("-fx-font-size: 15pt;");
			equal.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					r = 1;
					try {
						display.setText(eng.eval(display.getText()).toString());
						System.out.println(eng.eval(display.getText()).toString());
					} catch (ScriptException e) {
						e.printStackTrace();
						display.setText("Syntaxt ERROR");
					}
				}
				
			});
			
			add = new Button("+");
			add.setStyle("-fx-font-size: 15pt;");
			add.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() != "0") {
						display.setText(display.getText()+"+");
						add.setDisable(true);
						sub.setDisable(true);
						mul.setDisable(true);
						div.setDisable(true);
					}
					
					one.setDisable(false);
					two.setDisable(false);
					three.setDisable(false);
					four.setDisable(false);
					five.setDisable(false);
					six.setDisable(false);
					seven.setDisable(false);
					eight.setDisable(false);
					nine.setDisable(false);
					zero.setDisable(false);
					comma.setDisable(false);
					
				}
				
			});
			
			sub = new Button("-");
			sub.setStyle("-fx-font-size: 15pt;");
			sub.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() == "0") {
						display.setText("-");
					}
					else {
						display.setText(display.getText()+"-");
					}
					
					add.setDisable(true);
					sub.setDisable(true);
					mul.setDisable(true);
					div.setDisable(true);
					one.setDisable(false);
					two.setDisable(false);
					three.setDisable(false);
					four.setDisable(false);
					five.setDisable(false);
					six.setDisable(false);
					seven.setDisable(false);
					eight.setDisable(false);
					nine.setDisable(false);
					zero.setDisable(false);
					comma.setDisable(false);
					
				}
				
			});
			
			mul = new Button("x");
			mul.setStyle("-fx-font-size: 15pt;");
			mul.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() != "0") {
						display.setText(display.getText()+"x");
						add.setDisable(true);
						sub.setDisable(true);
						mul.setDisable(true);
						div.setDisable(true);
					}
					
					one.setDisable(false);
					two.setDisable(false);
					three.setDisable(false);
					four.setDisable(false);
					five.setDisable(false);
					six.setDisable(false);
					seven.setDisable(false);
					eight.setDisable(false);
					nine.setDisable(false);
					zero.setDisable(false);
					comma.setDisable(false);
					
				}
				
			});
			
			div = new Button("/");
			div.setStyle("-fx-font-size: 15pt;");
			div.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					if(display.getText() != "0") {
						display.setText(display.getText()+"/");
						add.setDisable(true);
						sub.setDisable(true);
						mul.setDisable(true);
						div.setDisable(true);
					}
					
					one.setDisable(false);
					two.setDisable(false);
					three.setDisable(false);
					four.setDisable(false);
					five.setDisable(false);
					six.setDisable(false);
					seven.setDisable(false);
					eight.setDisable(false);
					nine.setDisable(false);
					zero.setDisable(false);
					comma.setDisable(false);
				}
				
			});
			
			comma = new Button(".");
			comma.setStyle("-fx-font-size: 15pt;");
			comma.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent event) {
					
					add.setDisable(false);
					sub.setDisable(false);
					mul.setDisable(false);
					div.setDisable(false);
					display.setText(display.getText()+".");
				}
				
			});
			
			root.add(display, 0, 0, 4, 1);
			root.addRow(1, add, sub, mul, div);
			root.addRow(2,seven,eight,nine);
			root.add(ce,3,2,4,1);
			root.addRow(3,four,five,six);
			root.addRow(4,one,two,three);
			root.addRow(5,zero,comma);
			root.add(equal,3,5);
			
			primaryStage.setResizable(false);
			primaryStage.setMaximized(false);
			
			primaryStage.show();	
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}