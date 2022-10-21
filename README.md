<div id="top"></div>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://console.cloud.google.com/">
    <img src="https://www.gstatic.com/devrel-devsite/prod/vc890b700b898929d6a9586ce333c0fb7d88f26c0e62aab16b11d9d648f110bfc/cloud/images/social-icon-google-cloud-1200-630.png" alt="Logo" width="280" height="150">
  </a>

  <h3 align="center">Datastore Spring Boot Integration</h3>

  <p align="center">
    Spring Boot & Datastore Integration
    <br />
    <a href="https://cloud.google.com/datastore"><strong>Explore the docs »</strong></a>
    <br />
    <br />
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
    </li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## Google Cloud Personal Account

In order to integrate a Spring Boot application with a Datastore database, it's necessary to setup an account on Google Cloud Platform. For that, follow those steps:
1. Go to [Google Cloud Console](https://console.cloud.google.com/)
2. Add a Billing account [here](https://console.cloud.google.com/billing)


After the account is already set, let's configure a new project:
1. On the top part of the page, click on the dropdown and on new project button:

<br />
<div align="center">
    <img src="images/new_project.png" alt="Logo" width="600" height="500">
  </p>
</div>

2. Select a Project Name and hit the Create button

<br />
<div align="center">
    <img src="images/select_a_project_name.png" alt="Logo" width="600" height="500">
  </p>
</div>

3. After the project is created, select it!

<br />
<div align="center">
    <img src="images/select_the_project.png" alt="Logo" width="600" height="500">
  </p>
</div>

4. Click on Datastore and Select **DATASTORE MODE**

<br />
<div align="center">
    <img src="images/create_datastore.png" alt="Logo" width="600" height="750">
  </p>
</div>


<p align="right">(<a href="#top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Service Accounts

1. In order to setup the credentials JSON for using the application, go to IAM -> Service Accounts

<br />
<div align="center">
    <img src="images/service_accounts.png" alt="Logo" width="600" height="750">
  </p>
</div>

2. Click on Create Service Account

<br />
<div align="center">
    <img src="images/new_service_account.png" alt="Logo" width="1050" height="450">
  </p>
</div>

3. Select the Service Account Name and Assign the Rule as **Datastore Editor**

4. Back on the main page, go to Manage Keys option

<br />
<div align="center">
    <img src="images/new_key.png" alt="Logo" width="1050" height="450">
  </p>
</div>

5. Add a new Key and select JSON type. The Download will happen automatically. 

<br />
<div align="center">
    <img src="images/add_key.png" alt="Logo" width="1050" height="450">
  </p>
</div>

6. In order to use that in your Spring Boot application, use as a Environment Variable with the name of GOOGLE_APPLICATION_CREDENTIALS (the value should be the location of this file).


PS: **Remember to don't commit this file. This is a private key**
