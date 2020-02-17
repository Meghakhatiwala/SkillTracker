package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @RequestMapping
    @ResponseBody
    public String SkillTrackerDefault() {
        String html =
                "<html>" +
                  "<body>" +
                     "<form>" +
                      "<h1>Skills Tracker</h1>" +
                      "<h2>We have few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>"+
                          "<li>Java</li>"+
                          "<li>JavaScript</li>"+
                          "<li>Python</li>"+
                        "</ol>"+
                     "</form>" +
                  "</body>" +
                "</html>";
        return html;
    }


    @PostMapping(value = "SkillTracker")
    @ResponseBody
    public String SkillTracker(@RequestParam String name, @RequestParam String choice1, @RequestParam String choice2, @RequestParam String choice3) {
        String html =
                "<html>" +
                        "<body>" +
                        "<form>" +
                        "<h1>" + name + "</h1>" +
                        //"<h2>We have few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>"+
                        "<li>" + choice1 + "</li>"+
                        "<li>" + choice2 + "</li>"+
                        "<li>" + choice3 + "</li>"+
                        "</ol>"+
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping
    @RequestMapping(value="form")
    @ResponseBody
    public String form() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/SkillTracker'>" +
                        "<p>Name: </p>\n" +
                        "<input type = 'text' name = 'name'>" +
                        "<p>My favorite language:</p>" +
                           "<select name = 'choice1' id = 'first-choice'>" +
                           "<option value = \"Java\">Java</option>" +
                           "<option value = \"JavaScript\">Javascript</option>" +
                           "<option value = \"Python\">Python</option>" +
                           "</select>" +
                        "</p>" +
                        "<p>My second favorite language:</p>" +
                           "<select name = 'choice2' id = 'second-choice'>" +
                           "<option value = \"Java\">Java</option>" +
                           "<option value = \"Javascript\">Javascript</option>" +
                           "<option value = \"Python\">Python</option>" +
                           "</select>" +
                        "</p>" +
                        "<p>My third favorite language:</p>" +
                           "<select name = 'choice3' id = 'third-choice'>" +
                           "<option value = \"Java\">Java</option>" +
                           "<option value = \"Javascript\">Javascript</option>" +
                           "<option value = \"Python\">Python</option>" +
                           "</select>" +
                        "</p>" +
                        "<input type='submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
