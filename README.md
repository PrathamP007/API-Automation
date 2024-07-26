##### Simple API Automation framework 

### Directory & File structure 
There is one directory that contains all the endpoints in the form of `.json` as described below. 
```
├── src
│   ├── endpoints               → directory which contains all the endpoints  
|   │   ├── getUsers.json       → Request json file to get all the users endpoint 
|   │   ├── getSingleUser.json  → Request json file to get a single user endpoint 
|   |   └── createUser.json     → Request json file to create a  new user 
```

You can add more .json files for a new API requests,Ensuring the standard format as given jsons.

 # Functional Acceptance Criteria 
- Framework is able to test all the endpoint one by one under the `endpoints/*` directory.
- Every assertions mentioned in `endpoints/**.json` file will be asserted.

### Coding standards  
- Every line of code is clean, well-commented, and self-explanatory. 
- My code is scalable & maintainable in the long run. 
