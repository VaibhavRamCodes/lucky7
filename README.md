# 🎰 Lucky 7 Dice Game (Java CLI)

A simple **console-based casino game** built in Java where players bet money on rolling dice.
If the sum equals **7**, you win big — otherwise, you lose your bet.

---

## 🚀 Features

* 🎲 Random dice rolling (2 dice)
* 💰 Betting system with balance tracking
* 🏆 Win condition: sum of dice = 7
* 🔁 Replay option
* ⚠️ Input validation (bet limits, balance check)
* 🧠 Simple CLI-based user interaction

---

## 🛠️ Tech Stack

* **Language:** Java
* **Concepts Used:**

    * OOP (Classes & Methods)
    * Random number generation
    * User input handling (Scanner)
    * Conditional logic

---

## 📂 Project Structure

```text
lucky 7 game/
│── src/
│   └── com/vaibhav/lucky7/
│       └── Lucky7.java    # Main game logic (includes gameStart class)
│
│── out/                   # Compiled files (ignored in .gitignore)
│── .gitignore
│── LICENSE
```

---

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/lucky7-game.git
cd lucky-7-game
```

### 2. Navigate to Source Folder

```bash
cd src
```

### 3. Compile the Program

```bash
javac com/vaibhav/lucky7/*.java
```

### 4. Run the Application

```bash
java com.vaibhav.lucky7.P7
```
---

### 💡 Alternative (Using IntelliJ IDEA)

* Open the project in IntelliJ
* Go to src/com/vaibhav/lucky7/
* Run the file containing main() (P7.java)


## 🎮 How to Play

1. Start the game
2. Enter your total amount
3. Place a bet
4. Dice rolls 🎲
5. If sum = 7 → You win 3x bet
6. Else → You lose the bet
7. Choose to play again or exit

---

## 💡 Example Gameplay

||| Welcome to V's Casino |||

Enter amount: 1000
Enter bet: 100

Dice Rolling...
Dice 1: 3
Dice 2: 4

🎉 You won!
Balance: 1200

---

## ⚠️ Rules

* Bet must be:

    * Greater than 0
    * Less than or equal to your balance
* Game ends when balance = 0

---

## 🔮 Future Improvements

* 🎯 Add difficulty levels
* 🖥️ GUI version (JavaFX / Swing)
* 📊 Game statistics tracking
* 💾 Save/load game progress
* 🌐 Multiplayer mode

---

## 👨‍💻 Author

**Vaibhav**
📍 Delhi, India

---

## ⭐ Contribution

Feel free to fork, improve, and submit a PR!

---

## 📜 License

This project is open-source and available under the MIT License.
