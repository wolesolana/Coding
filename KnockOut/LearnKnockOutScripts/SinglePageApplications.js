function WebmailViewModel() {
    // Data
    var self = this;
    self.folders = ['Inbox', 'Archive', 'Sent', 'Spam'];
    self.chosenFolderId = ko.observable();
    self.chosenFolderData = ko.observable();
    self.chosenMailData = ko.observable();

    // Behaviours    
    self.goToFolder = function(folder) { location.hash = folder};
        // Original commands before adding sammy.js
        /* self.chosenFolderId(folder);
        self.chosenMailData(null); // Stop showing a mail
       $.get('/mail', { folder: folder }, self.chosenFolderData);
    }; */
    
    self.goToMail = function(mail){ location.hash = mail.folder + '/' + mail.id };
        // Original commands before adding sammy.jse
        /* self.chosenFolderId(mail.folder);
        self.chosenFolderData(null);
        $.get("/mail", { mailId: mail.id}, self.chosenMailDta);
    }; */
    
    // Client-side routes
    Sammy(function() {
        this.get('#:folder', function() {
            self.chosenFolderId(this.params.folder);
            self.chosenMailData(null);
            $.get("/mail", { folder: this.params.folder }, self.chosenFolderData);
        });
        
        this.get('#:folder/:mailId', function() {
            self.chosenFolderId(this.params.folder);
            self.chosenFolderData(null);]
            $.get("/mail", { mailId: this.params.mailId }, self.chosenMailData)
        });
        
        this.get('', function() { this.app.runRoute('get', '#Inbox') });
    }).run();
};

ko.applyBindings(new WebmailViewModel());