Here’s a step-by-step guide to set up Visual Studio Code (VS Code) and configure the Jupyter notebook (ipynb) kernel:

### Setting Up VS Code and Jupyter Notebook Kernel

#### 1. **Install VS Code**

- **Download and Install:**
  - Go to [VS Code download page](https://code.visualstudio.com/).
  - Download the installer for your operating system (Windows, macOS, or Linux).
  - Run the installer and follow the installation instructions.

#### 2. **Install Python**

- **Download and Install:**
  - Go to [Python download page](https://www.python.org/downloads/).
  - Download the latest version of Python.
  - Run the installer and make sure to check the box that says "Add Python to PATH."

#### 3. **Install Python Extensions in VS Code**

- **Open VS Code:**
  - Launch VS Code.

- **Install Extensions:**
  - Go to the Extensions view by clicking on the Extensions icon in the sidebar or pressing `Ctrl+Shift+X` (Windows/Linux) or `Cmd+Shift+X` (macOS).
  - Search for "Python" and install the Python extension by Microsoft.
  - Search for "Jupyter" and install the Jupyter extension by Microsoft.

#### 4. **Install Jupyter Notebook**

- **Open Terminal:**
  - Open a terminal or command prompt (you can open it from within VS Code by going to `Terminal` > `New Terminal`).

- **Install Jupyter:**
  - Run the following command to install Jupyter using pip:
    ```bash
    pip install jupyter
    ```

#### 5. **Set Up a Python Environment (Optional but Recommended)**

- **Create a Virtual Environment:**
  - In your terminal, navigate to your project directory or create a new directory:
    ```bash
    mkdir my_project
    cd my_project
    ```
  - Create a virtual environment:
    ```bash
    python -m venv venv
    ```
  - Activate the virtual environment:
    - **Windows:**
      ```bash
      venv\Scripts\activate
      ```
    - **macOS/Linux:**
      ```bash
      source venv/bin/activate
      ```

- **Install Jupyter in Virtual Environment:**
  - With the virtual environment activated, install Jupyter:
    ```bash
    pip install jupyter
    ```

#### 6. **Open and Configure Jupyter Notebook in VS Code**

- **Open VS Code:**
  - Open VS Code and navigate to the directory where your Jupyter notebooks are located or create a new directory.

- **Open a Jupyter Notebook File:**
  - You can open an existing `.ipynb` file or create a new one by going to `File` > `New File` and saving it with the `.ipynb` extension.

- **Select Python Interpreter:**
  - Click on the kernel name in the top-right corner of the notebook interface in VS Code (it might show `Python 3` or similar).
  - Select the Python interpreter or virtual environment you want to use. If you're using a virtual environment, make sure it's activated and selected.

- **Install Jupyter Kernel (if necessary):**
  - If your kernel is not listed, you might need to install the Jupyter kernel for your environment. Run the following command in the terminal:
    ```bash
    python -m ipykernel install --user --name=myenv --display-name "Python (myenv)"
    ```
  - Replace `myenv` with your environment name.

#### 7. **Run and Test**

- **Run Cells:**
  - Open a notebook file in VS Code.
  - You can now run cells in the notebook using the run button or by pressing `Shift+Enter`.


-------------------------------------------------------------------------------------

### **Installing OpenJDK on Windows and macOS**

#### **Windows**

1. **Download OpenJDK:**
   - Go to the [Adoptium website](https://adoptium.net/) or [Oracle JDK download page](https://www.oracle.com/java/technologies/javase-downloads.html).
   - Select the version of OpenJDK you need and download the installer for Windows (usually an `.msi` or `.zip` file).

2. **Install OpenJDK:**
   - If you downloaded the `.msi` installer, run it and follow the installation wizard.
   - If you downloaded a `.zip` file, extract it to a location like `C:\Program Files\Java`.

3. **Set Environment Variables:**
   - Open the Start Menu, search for `Environment Variables`, and select `Edit the system environment variables`.
   - In the System Properties window, click `Environment Variables`.
   - Under `System variables`, click `New` and add:
     - **Variable name:** `JAVA_HOME`
     - **Variable value:** The path to your JDK installation (e.g., `C:\Program Files\Java\jdk-11.0.13`).
   - Find the `Path` variable in the `System variables` section, select it, and click `Edit`.
   - Add `%JAVA_HOME%\bin` to the list of paths.
   - Click `OK` to close all dialogs.

4. **Verify Installation:**
   - Open Command Prompt (cmd) and run:
     ```cmd
     java -version
     ```

#### **macOS**

1. **Install Homebrew (if not already installed):**

   Open Terminal and run:
   ```bash
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   ```

2. **Install OpenJDK:**

   In Terminal, run:
   ```bash
   brew install openjdk
   ```

3. **Set Environment Variables:**

   Add the following lines to your shell profile (`.zshrc` for zsh or `.bash_profile` for bash):

   ```bash
   export JAVA_HOME=$(/usr/libexec/java_home)
   export PATH=$JAVA_HOME/bin:$PATH
   ```

   Apply the changes:
   ```bash
   source ~/.zshrc   # or source ~/.bash_profile
   ```

4. **Verify Installation:**

   In Terminal, run:
   ```bash
   java -version
   ```


-------------------------------------------------------------------------------------

# SDImax Calculator Program

The **SDImax Calculator** is a powerful tool that uses a robust machine learning model powered by H2O to calculate SDImax. This is a one-click-get-result program, and you will receive the result in an Excel file with just a single click.

## Instructions to Run the Program

1. **Open Your Text Editor:**
   - Open your favorite text editor.

2. **Open the Project Folder:**
   - Open this folder in your text editor.

3. **Install Required Packages:**
   - Open the terminal in your text editor and run the following command:
     ```bash
     pip install -r requirements.txt
     ```
     This command will install the necessary Python packages.

4. **Run the Jupyter Notebook:**
   - Navigate to `run_model.ipynb` and click on `Run All`.

   After running all the cells, you will find your results in a CSV file (which works as an XLSX) located in the `result` folder.

## Requirements

To run this program, you will need your shapefile(s). You can use multiple shapefiles with any names you prefer.

### Each Feature Should Have the Following Properties:

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
| curr_QMD     | Float         |
| curr_TPA     | Float         |

**Note:** You do not need to modify anything in the source folder. It should remain untouched.

Once the model has run, your results will be in the `result` folder.


You may not need to work with anything in the source folder. It needs to be untouched. 

Once you run this model, your result will be in result folder. 

