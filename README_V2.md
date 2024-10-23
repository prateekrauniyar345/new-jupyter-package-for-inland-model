# SDImax Calculator Program

The **SDImax Calculator** is a powerful tool that uses a machine learning model to calculate SDImax. You can easily run the program and receive the results in an Excel file with just a single click.

## Setup Instructions

### For Windows

1. **Install Visual Studio Code (VS Code)**  
   - Download from the [VS Code download page](https://code.visualstudio.com/).
   - Run the installer and follow the instructions.

2. **Install Python**  
   - Download from the [Python download page](https://www.python.org/downloads/).
   - Run the installer and ensure you check "Add Python to PATH."

3. **Install Python Extensions in VS Code**  
   - Open VS Code.
   - Go to Extensions (`Ctrl+Shift+X`).
   - Search for and install the following extensions:
     - **Python** by Microsoft
     - **Jupyter** by Microsoft

4. **Install Jupyter Notebook**  
   - Open the terminal in VS Code (`Terminal > New Terminal`).
   - Run:
     ```bash
     pip install jupyter
     ```

5. **Set Up a Virtual Environment (Optional)**  
   - Create a new project folder and navigate to it:
     ```bash
     mkdir my_project
     cd my_project
     ```
   - Create and activate a virtual environment:
     ```bash
     python -m venv venv
     venv\Scripts\activate
     ```
   - Install Jupyter in the virtual environment:
     ```bash
     pip install jupyter
     ```

6. **Open and Configure Jupyter Notebook in VS Code**  
   - Open a Jupyter notebook file (`.ipynb`) in VS Code.
   - Select your Python interpreter from the top-right corner of the notebook.
   - If your kernel is not listed, run:
     ```bash
     python -m ipykernel install --user --name=myenv --display-name "Python (myenv)"
     ```
   - Replace `myenv` with your environment name.

### For macOS

1. **Install Visual Studio Code (VS Code)**  
   - Download from the [VS Code download page](https://code.visualstudio.com/).
   - Run the installer and follow the instructions.

2. **Install Python**  
   - Download from the [Python download page](https://www.python.org/downloads/).
   - Run the installer and ensure you check "Add Python to PATH."

3. **Install Python Extensions in VS Code**  
   - Open VS Code.
   - Go to Extensions (`Cmd+Shift+X`).
   - Search for and install the following extensions:
     - **Python** by Microsoft
     - **Jupyter** by Microsoft

4. **Install Jupyter Notebook**  
   - Open the terminal in VS Code (`Terminal > New Terminal`).
   - Run:
     ```bash
     pip install jupyter
     ```

5. **Set Up a Virtual Environment (Optional)**  
   - Create a new project folder and navigate to it:
     ```bash
     mkdir my_project
     cd my_project
     ```
   - Create and activate a virtual environment:
     ```bash
     python -m venv venv
     source venv/bin/activate
     ```
   - Install Jupyter in the virtual environment:
     ```bash
     pip install jupyter
     ```

6. **Open and Configure Jupyter Notebook in VS Code**  
   - Open a Jupyter notebook file (`.ipynb`) in VS Code.
   - Select your Python interpreter from the top-right corner of the notebook.
   - If your kernel is not listed, run:
     ```bash
     python -m ipykernel install --user --name=myenv --display-name "Python (myenv)"
     ```
   - Replace `myenv` with your environment name.

### SDImax Calculator Instructions

1. **Open Your Text Editor**  
   - Launch your favorite text editor (like VS Code).

2. **Open the Project Folder**  
   - Open the folder containing your SDImax Calculator project.

3. **Install Required Packages**  
   - In the terminal, run:
     ```bash
     pip install -r requirements.txt
     ```

4. **Run the Jupyter Notebook**  
   - Open `run_model.ipynb`.
   - Click on `Run All` to execute all cells.
   - Your results will be saved in a CSV file located in the `result` folder.

### Requirements

- You will need shapefile(s) for the program, and you can use multiple shapefiles with any names you prefer.
- Each feature should have the following properties:

| **Property** | **Data Type** |
|--------------|---------------|
| StandID      | Double        |
| QMD          | Float         |
| RC_PROP      | Float         |
| WH_PROP      | Float         |
| GF_PROP      | Float         |
| LP_PROP      | Float         |
| WL_PROP      | Float         |
| DF_PROP      | Float         |
| PP_PROP      | Float         |


**Note:** Do not modify anything in the source folder; it should remain untouched. Your results will be in the `result` folder after the model runs.

